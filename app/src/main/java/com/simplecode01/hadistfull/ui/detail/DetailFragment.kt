package com.simplecode01.hadistfull.ui.detail

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.net.Uri
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.app.ShareCompat
import androidx.core.text.HtmlCompat
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.geniusforapp.fancydialog.builders.FancyDialogBuilder
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.muslimdeveloper.sabilulkhayralibana.ui.common.Status
import com.simplecode01.hadistfull.R
import com.simplecode01.hadistfull.api.data.HadistAPI
import com.simplecode01.hadistfull.databinding.FragmentDetailHadithBinding
import com.simplecode01.hadistfull.ui.MainViewModel
import com.simplecode01.hadistfull.ui.hadith.HadithViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class DetailFragment : Fragment(R.layout.fragment_detail_hadith) {

    private val binding: FragmentDetailHadithBinding by viewBinding()
    private val viewModelMain: MainViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val id = arguments?.getInt(EXTRA_ID)!!
        val endPoint = arguments?.getString(EXTRA_END_POINT)!!
        val title = arguments?.getString(EXTRA_TITLE)


        if(isNetworkAvailable()){
            viewModelMain.getInfo(endPoint, id).observe(viewLifecycleOwner){ resource ->
                when(resource.status){
                    Status.LOADING ->{
                        binding.progressBarrLoading.isVisible = true
                    }
                    Status.SUCCESS ->{
                        binding.progressBarrLoading.isVisible = false
                        resource.data?.let { dataHadist ->
                            val hadithArabic = dataHadist.data.x1.nass
                            val hadithTranslate = dataHadist.data.x1.terjemah
                            val hadithId = dataHadist.data.x1.id
                            binding.tvTitle.text = "Hadist ke $hadithId $title"
                            if (hadithArabic == null){
                            }else{
                                binding.tvArabic.text = HtmlCompat.fromHtml(hadithArabic, HtmlCompat.FROM_HTML_MODE_LEGACY)
                            }
                            if (hadithTranslate == null){
                            }else{
                                binding.tvTranslate.text = HtmlCompat.fromHtml(hadithTranslate, HtmlCompat.FROM_HTML_MODE_LEGACY)
                            }

                            binding.ivMore.setOnClickListener {
                                val view = layoutInflater.inflate(R.layout.bottom_menu_dialog, null)
                                val dialog = BottomSheetDialog(requireContext())

                                var translateTrue = ""
                                var arabicTrue = ""

                                if(hadithArabic == null){
                                    arabicTrue = ""
                                }else{
                                    arabicTrue = HtmlCompat.fromHtml(hadithArabic, HtmlCompat.FROM_HTML_MODE_LEGACY).toString()
                                }
                                if (hadithTranslate == null ){
                                    translateTrue = ""
                                }else{
                                    translateTrue = HtmlCompat.fromHtml(hadithTranslate, HtmlCompat.FROM_HTML_MODE_LEGACY).toString()
                                }


                                val btnCopy = view.findViewById<LinearLayout>(R.id.copyHadist)
                                val btnShare = view.findViewById<LinearLayout>(R.id.shareHadist)
                                val btnReport = view.findViewById<LinearLayout>(R.id.reportErrorHadist)
                                val btnClose = view.findViewById<ImageView>(R.id.close_bottom)

                                val hadistContent = "Kitab $title hadist ke $hadithId \n\n $arabicTrue \n\n Translate:\n $translateTrue"

                                dialog.setCancelable(true)
                                dialog.setContentView(view)

                                dialog.show()


                                btnClose.setOnClickListener {
                                    dialog.dismiss()
                                }
                                btnReport.setOnClickListener {
                                    val errorContent = "Kitab $title Hadist ke -$hadithId \n\n-Hadist : \n$arabicTrue\n\n-Translate : \n$translateTrue"
                                    val selectorIntent = Intent(Intent.ACTION_SENDTO)
                                    selectorIntent.data = Uri.parse("mailto:")

                                    val emailIntent = Intent(Intent.ACTION_SEND)
                                    emailIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("quranmuslimcode@gmail.com"))
                                    emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Error Report")
                                    emailIntent.putExtra(Intent.EXTRA_TEXT, "Error Report \n\n ${errorContent} \n\n Input Error here : \n")
                                    emailIntent.selector = selectorIntent

                                    requireActivity().startActivity(Intent.createChooser(emailIntent, "Send email..."))
                                }
                                btnCopy.setOnClickListener {
                                    val clipboard: ClipboardManager = requireContext().getSystemService(Context.CLIPBOARD_SERVICE)as ClipboardManager
                                    val clip = ClipData.newPlainText("copy_hadist", hadistContent)
                                    clipboard.setPrimaryClip(clip)
                                    dialog.dismiss()
                                }
                                btnShare.setOnClickListener {
                                    ShareCompat.IntentBuilder(requireContext())
                                        .setText(hadistContent)
                                        .setType("text/plain")
                                        .startChooser()
                                    dialog.dismiss()
                                }

                            }

                        }
                    }
                    Status.ERROR ->{
                        val dialog = FancyDialogBuilder(requireContext(), R.style.CustomDialog)
                            .withImageIcon(R.drawable.error)
                            .withTextGravity(Gravity.CENTER)
                            .withPanelGravity(Gravity.END)
                            .withTitle("Error")
                            .withSubTitle(resource.message.toString())
                            .withPositive("accept") { view, dialog ->
                                findNavController().navigate(R.id.action_nav_detail_to_nav_hadith_book)
                                dialog.dismiss()
                            }
                        dialog.show()
                    }
                }
            }
        }else{
            val dialog = FancyDialogBuilder(requireContext(), R.style.CustomDialog)
                .withImageIcon(R.drawable.error)
                .withTextGravity(Gravity.CENTER)
                .withPanelGravity(Gravity.END)
                .withTitle("Error Connection")
                .withSubTitle("Please connect your device with internet & try again")
                .withPositive("accept") { view, dialog ->
                    findNavController().navigate(R.id.action_nav_detail_to_nav_hadith_book)
                    dialog.dismiss()
                }
            dialog.show()
        }

    }
    private fun isNetworkAvailable() = (requireContext().getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager).run {
        getNetworkCapabilities(activeNetwork)?.run {
            hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) || hasTransport(NetworkCapabilities.TRANSPORT_WIFI) || hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET)
        } ?: false
    }

    companion object{
        const val EXTRA_TITLE: String = "TITLE"
        const val EXTRA_END_POINT: String = "END_POINT"
        const val EXTRA_ID: String = "ID"
    }
}

package com.simplecode01.hadistfull.ui.listhadits

import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.simplecode01.hadistfull.R
import com.simplecode01.hadistfull.adapter.ListHadithAdapter
import com.simplecode01.hadistfull.databinding.FragmentListHadithBinding
import com.simplecode01.hadistfull.model.ListHadith
import com.simplecode01.hadistfull.ui.hadith.HadithViewModel

class ListHadithFragment : Fragment(R.layout.fragment_list_hadith) {

    private val binding: FragmentListHadithBinding by viewBinding()

    private val viewModel: HadithViewModel by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val total_hadith = viewModel.count
        var title = viewModel.judul
        var endpoint = viewModel.endpoint
        var bookCover = viewModel.coverBook

        val adapter = ListHadithAdapter(total_hadith, title, endpoint)
        binding.rvListHadith.adapter = adapter
        Glide.with(requireContext())
            .load(bookCover)
            .transform(RoundedCorners(20))
            .apply(RequestOptions.placeholderOf(R.drawable.ic_loading))
            .error(R.drawable.ic_error)
            .into(binding.ivBookCover)


        adapter.itemClickListener={ endPoint: String, iD: Int ->
            viewModel.endpoint = endpoint
            viewModel.id = iD
            findNavController().navigate(R.id.action_nav_list_hadith_to_nav_view_pager)
        }
    }

}
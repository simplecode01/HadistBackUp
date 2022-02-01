package com.simplecode01.hadistfull.ui.hadith

import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.simplecode01.hadistfull.R
import com.simplecode01.hadistfull.adapter.HadithBookAdapter
import com.simplecode01.hadistfull.data.data_hadith
import com.simplecode01.hadistfull.databinding.FragmentHadithBinding

class HadithFragment : Fragment(R.layout.fragment_hadith) {

    private val binding: FragmentHadithBinding by viewBinding()
    private val viewModel: HadithViewModel by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.progressBar.isVisible = true
        val getHadith = data_hadith.getHadithBook()
        val adapter = HadithBookAdapter(getHadith)
        binding.rvHadith.adapter = adapter
        binding.progressBar.isVisible = false

        adapter.itemClickListener ={
            viewModel.judul = it.title
            viewModel.endpoint = it.endPointBook
            viewModel.count = it.count
            viewModel.coverBook = it.bookCover
            findNavController().navigate(R.id.action_nav_hadith_book_to_nav_list_hadith)
        }
    }

}
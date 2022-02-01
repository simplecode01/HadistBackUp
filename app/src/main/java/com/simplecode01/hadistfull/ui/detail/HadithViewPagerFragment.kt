package com.simplecode01.hadistfull.ui.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.simplecode01.hadistfull.R
import com.simplecode01.hadistfull.databinding.FragmentHadithViewPagerBinding
import com.simplecode01.hadistfull.ui.hadith.HadithViewModel

class HadithViewPagerFragment : Fragment(R.layout.fragment_hadith_view_pager) {
    private val binding: FragmentHadithViewPagerBinding by viewBinding()
    private val viewModel: HadithViewModel by activityViewModels()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var totalHadist = viewModel.count
        var titleHadist = viewModel.judul
        var endPointHadist = viewModel.endpoint
        val adapter = ViewPagerAdapter(this,
            totalHadist,
            titleHadist,
            endPointHadist
        )
        binding.viewPager.adapter = adapter

        TabLayoutMediator(binding.tabLayout, binding.viewPager){tab, position ->
//            tab.text = (position + 1).toString()
            var number = (position)
            tab.text = "$number"
        }.attach()
    }

}
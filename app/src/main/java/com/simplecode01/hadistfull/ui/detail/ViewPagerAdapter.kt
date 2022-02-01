package com.simplecode01.hadistfull.ui.detail

import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.simplecode01.hadistfull.ui.hadith.HadithFragment

class ViewPagerAdapter(fragment: Fragment, val bookCount: Int, val title: String, val endPoint: String): FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int {
        return bookCount
    }

    override fun createFragment(position: Int): Fragment {
        return DetailFragment().apply {
            arguments = bundleOf(
                DetailFragment.EXTRA_ID to position + 1,
                DetailFragment.EXTRA_TITLE to title,
                DetailFragment.EXTRA_END_POINT to endPoint
            )
        }
    }

}
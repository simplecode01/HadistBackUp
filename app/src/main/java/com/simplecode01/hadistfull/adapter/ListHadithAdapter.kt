package com.simplecode01.hadistfull.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.l4digital.fastscroll.FastScroller
import com.simplecode01.hadistfull.R
import com.simplecode01.hadistfull.databinding.ItemListHadithBinding
import com.simplecode01.hadistfull.model.ListHadith

class ListHadithAdapter(var getTotal: Int, var title: String, var endpoint: String):
    RecyclerView.Adapter<ListHadithAdapter.BookViewHolder>(), FastScroller.SectionIndexer {

    var itemClickListener: ((String, Int) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list_hadith, parent, false)
        return BookViewHolder(view)
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        val noHadist = position+1
        holder.binding.tvListHadith.text = "$title : $noHadist"
        holder.itemView.setOnClickListener {
            itemClickListener?.invoke(endpoint,noHadist)
        }
    }

    override fun getItemCount(): Int {
        return getTotal
    }

    override fun getSectionText(position: Int): CharSequence {
        val indexKitab = position+1
        val popuptext = "Kitab $title ke : $indexKitab"
        return popuptext
    }

    class BookViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val binding = ItemListHadithBinding.bind(itemView)

    }
}
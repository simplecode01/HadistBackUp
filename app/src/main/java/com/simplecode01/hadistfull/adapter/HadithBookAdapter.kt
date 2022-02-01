package com.simplecode01.hadistfull.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.simplecode01.hadistfull.R
import com.simplecode01.hadistfull.databinding.ItemHadithBinding
import com.simplecode01.hadistfull.model.HadithBook

class HadithBookAdapter(val bookList: List<HadithBook>): RecyclerView.Adapter<HadithBookAdapter.BookViewHolder>() {


    var itemClickListener: ((HadithBook) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_hadith, parent, false)
        return BookViewHolder(view)
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        val book = bookList[position]
        holder.bindView(book)
        holder.itemView.setOnClickListener {
            itemClickListener?.invoke(book)
        }
    }

    override fun getItemCount(): Int {
        return bookList.size
    }

    class BookViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val binding = ItemHadithBinding.bind(itemView)

        fun bindView(book:HadithBook) = with(binding){
            Glide.with(itemView.context)
                .load(book.bookCover)
                .transform(RoundedCorners(20))
                .apply(RequestOptions.placeholderOf(R.drawable.ic_loading))
                .error(R.drawable.ic_error)
                .into(binding.bookCover)
            bookTitle.text = book.title
            bookCount.text = "Total Hadist ${book.count}"
            bookTitle.isSelected = true
        }

    }
}
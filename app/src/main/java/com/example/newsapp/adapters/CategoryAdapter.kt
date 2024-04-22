package com.example.newsapp.adapters

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.newsapp.R
import com.example.newsapp.dataclass.Category
import com.example.newsapp.fragments.NewsWireFragment

class CategoryAdapter(private var array: Array<Category>, var context: FragmentActivity):
    RecyclerView.Adapter<CategoryAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view)
    {
        var title = view.findViewById<TextView>(R.id.categoryName)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_category, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
    val item = array[position]
        holder.title.text = item.nameCategory
        holder.itemView.setOnClickListener{
         val bundle = Bundle()
         bundle.putInt("CATEGORY",item.id)
            context.supportFragmentManager.beginTransaction().replace(com.google.android.material.R.id.container,NewsWireFragment::class.java,bundle)
                .addToBackStack(null).commit()
        }
    }

    override fun getItemCount(): Int {
        return array.size
    }

}
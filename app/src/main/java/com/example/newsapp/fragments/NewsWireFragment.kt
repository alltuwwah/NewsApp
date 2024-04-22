package com.example.newsapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.newsapp.Constans
import com.example.newsapp.R
import com.example.newsapp.adapters.CategoryAdapter
import com.example.newsapp.adapters.NewsAdapter

class NewsWireFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_news_wire, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val currentCategory = requireArguments().getInt("CATEGORY")
    val filteredCategory = Constans.news.filter { it.id == currentCategory }as ArrayList
    val recyclerView = view.findViewById<RecyclerView>(R.id.recycler)
    recyclerView.adapter = NewsAdapter(filteredCategory,requireActivity())
    }

            }
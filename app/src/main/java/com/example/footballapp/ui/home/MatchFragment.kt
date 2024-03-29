package com.example.footballapp.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.footballapp.R

class MatchFragment : Fragment() {

    private lateinit var matchViewModel: MatchViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        matchViewModel =
            ViewModelProviders.of(this).get(MatchViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_match, container, false)
        val textView: TextView = root.findViewById(R.id.text_match)
        matchViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}
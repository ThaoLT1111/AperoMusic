package com.example.myapplication
import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class BlankFragment01 : Fragment() {
    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_blank01, container, false)

        // Find the TextView in the layout
        val textView = view.findViewById<TextView>(R.id.txtHello)

        // Set the text for the TextView
        textView.text = "Fragment Text"

        return view
    }
}



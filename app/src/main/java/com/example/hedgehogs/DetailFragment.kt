package com.example.hedgehogs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView


class DetailFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_detail, container, false)
        val img = view?.findViewById<ImageView>(R.id.imageView)
    }
    // обновление текстового поля
    fun setSelectedItem(selectedItem: String?) {
        val views = view?.findViewById<TextView>(R.id.textView)
        val img = view?.findViewById<ImageView>(R.id.imageView)
        when(selectedItem){
            "Темноиглый ёж" -> {views?.setText(R.string.black)
                                img?.setImageResource(R.drawable.black)
            }
            "Белобрюхий ёж" -> {views?.setText(R.string.afric)
                img?.setImageResource(R.drawable.afric)
            }
            "Восточноевропейский ёж" -> {views?.setText(R.string.east)
                img?.setImageResource(R.drawable.east)
            }
        }
    }
}

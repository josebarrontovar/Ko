package com.example.fbjgbt.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fbjgbt.Model.Person
import com.example.fbjgbt.R
import java.util.*


class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    var persons = arrayListOf<Person>()
    private var rv: RecyclerView? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
      /*
        rv = root.findViewById(R.id.rv) as RecyclerView
        rv.setHasFixedSize(true)
        val llm = LinearLayoutManager(context)
        rv.layoutManager = llm
        initializeData();
        initializeAdapter();

        */

        rv = root.findViewById(R.id.rv) as RecyclerView

        val llm = LinearLayoutManager(context)
        rv!!.layoutManager=llm
        rv!!.setHasFixedSize(true)

        initializeData()
        initializeAdapter()

        val textView: TextView = root.findViewById(R.id.text_home)
        homeViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text =it
        })
        return root
    }

    private fun initializeData() {
        persons = ArrayList()
        persons.add(Person("Emma Wilson", "23 years old", R.drawable.com_facebook_button_icon))
        persons.add(Person("Lavery Maiss", "25 years old", R.drawable.com_facebook_button_icon))
        persons.add(Person("Lillie Watts", "35 years old",R.drawable.com_facebook_button_icon))
        persons.add(Person("Emma Wilson", "23 years old", R.drawable.com_facebook_button_icon))
        persons.add(Person("Lavery Maiss", "25 years old", R.drawable.com_facebook_button_icon))
        persons.add(Person("Lillie Watts", "35 years old",R.drawable.com_facebook_button_icon))
        persons.add(Person("Emma Wilson", "23 years old", R.drawable.com_facebook_button_icon))
        persons.add(Person("Lavery Maiss", "25 years old", R.drawable.com_facebook_button_icon))
        persons.add(Person("Lillie Watts", "35 years old",R.drawable.com_facebook_button_icon))
        persons.add(Person("Emma Wilson", "23 years old", R.drawable.com_facebook_button_icon))
        persons.add(Person("Lavery Maiss", "25 years old", R.drawable.com_facebook_button_icon))
        persons.add(Person("Lillie Watts", "35 years old",R.drawable.com_facebook_button_icon))
        persons.add(Person("Emma Wilson", "23 years old", R.drawable.com_facebook_button_icon))
        persons.add(Person("Lavery Maiss", "25 years old", R.drawable.com_facebook_button_icon))
        persons.add(Person("Lillie Watts", "35 years old",R.drawable.com_facebook_button_icon))
    }


    private fun initializeAdapter() {
        val adapter = RVAdapter(persons)
        rv!!.adapter = adapter
    }
}
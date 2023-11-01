package com.ahmed.apartofactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    lateinit var rv:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv=findViewById(R.id.main_recycle)

        var names = ArrayList<Name>()
        names.add(Name("Ahmed"))
        names.add(Name("kareem"))
        names.add(Name("radwa"))
        names.add(Name("sasa"))
        names.add(Name("abdo"))

        val listAdapter = NameAdapter(names)
        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = listAdapter


    }
}
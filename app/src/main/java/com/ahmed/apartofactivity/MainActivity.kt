package com.ahmed.apartofactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() , OnClickListener {
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
        val listAdapter = NameAdapter(names,this)
        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = listAdapter
    }
    override fun onItemClickListener(name: Name) {
        Toast.makeText(this,name.getName(),Toast.LENGTH_SHORT).show()

    }

}
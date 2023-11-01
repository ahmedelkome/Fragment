package com.ahmed.apartofactivity

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class NameAdapter : RecyclerView.Adapter<NameAdapter.NameHolder> {

    var Names = ArrayList<Name>()

    constructor(Names: ArrayList<Name>) : super() {
        this.Names = Names
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NameHolder {

        var v :View = LayoutInflater.from(parent.context).inflate(R.layout.custom_tv_layout
        ,parent,false)

        return NameHolder(v)
    }

    override fun getItemCount(): Int {

        return Names.size
    }

    override fun onBindViewHolder(holder: NameHolder, position: Int) {

        var name : Name
        name = Names.get(position)
        holder.bind(name)

    }



    class NameHolder(itemview: View) : RecyclerView.ViewHolder(itemview) {


        var tv_name:TextView = itemview.findViewById(R.id.custom_tv_text)

        lateinit var name : Name
        fun bind(name : Name)
        {
            this.name = name
            tv_name.setText(name.getName())
        }
    }


}
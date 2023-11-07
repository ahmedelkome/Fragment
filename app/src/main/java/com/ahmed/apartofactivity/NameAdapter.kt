package com.ahmed.apartofactivity


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView



class NameAdapter : RecyclerView.Adapter<NameAdapter.NameHolder> {


    constructor() : super() {}
    var Names = ArrayList<Name>()
    private lateinit var listener: OnClickListener



    constructor(Names: ArrayList<Name>, listener: OnClickListener){
        this.listener = listener
        this.Names = Names
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NameHolder {
        val v: View = LayoutInflater.from(parent.context).inflate(
            R.layout.custom_tv_layout, parent, false
        )
        return NameHolder(v)
    }


    override fun getItemCount(): Int {
        return Names.size
    }


    override fun onBindViewHolder(holder: NameHolder, position: Int) {
        val name: Name = Names.get(position)
        holder.bind(name)
    }


    inner  class NameHolder : RecyclerView.ViewHolder  {
        private var tv_name: TextView
        lateinit var name: Name
        constructor(itemview: View) : super(itemview) {
            tv_name = itemview.findViewById(R.id.custom_tv_text)
            itemview.setOnClickListener {
                listener.onItemClickListener(name)
            }
        }

        fun bind(name: Name) {
            this.name = name
            tv_name.text = name.getName()
        }


    }
}



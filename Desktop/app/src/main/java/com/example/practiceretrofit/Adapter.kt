package com.example.practiceretrofit

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(var list: List<ResponseItem>?) : RecyclerView.Adapter<Adapter.myAdapter>() {
    class myAdapter(view : View): RecyclerView.ViewHolder(view){
        var id : TextView=view.findViewById(R.id.txtId)
        var body : TextView=view.findViewById(R.id.txtBody)
        var title : TextView=view.findViewById(R.id.txtTitle)
        var userid : TextView=view.findViewById(R.id.txtUserId)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myAdapter {
        var v= LayoutInflater.from(parent.context).inflate(R.layout.rcv_item,parent,false)
        var view = myAdapter(v)
        return view
    }

    override fun getItemCount(): Int {

        return list!!.size
    }

    override fun onBindViewHolder(holder: myAdapter, position: Int) {
      holder.id.setText(list!![position].id.toString())
      holder.body.setText(list!![position].body)
      holder.title.setText(list!![position].title)
      holder.userid.setText(list!![position].userId.toString())


    }
}
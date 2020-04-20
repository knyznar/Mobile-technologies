package com.example.android_course_lab4

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView


class MyAdapter(private val myDataset: Array<ListElement>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    class MyViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.my_text_view) as TextView
        val image: ImageView = view.findViewById(R.id.imageView) as ImageView
        val relativeLayout: RelativeLayout = view.findViewById(R.id.relative_layout)

        init {
            image.setImageResource(R.drawable.ic_android_black_24dp)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): MyAdapter.MyViewHolder {

        val cell = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent,false)
        return MyViewHolder(cell)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val listElement: ListElement = myDataset[position];
        holder.textView.setText(myDataset[position].description)
        holder.image.setImageResource(myDataset[position].image)

        holder.relativeLayout.setOnClickListener(View.OnClickListener { view ->
            Toast.makeText(view.context, "click on item: " + listElement.description, Toast.LENGTH_LONG).show()
        })
    }

    override fun getItemCount() = myDataset.size
}
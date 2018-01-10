package io.hainguyen.viewpagerbugsample

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by HaiNguyen on 1/9/18.
 */
class Adapter(val context: Context) : RecyclerView.Adapter<MyViewHolder>() {
    override fun onBindViewHolder(holder: MyViewHolder?, position: Int) {

    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item, parent, false))
    }

    override fun getItemCount(): Int = 20
}

class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

}
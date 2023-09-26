package com.sec.appex1.ui.main.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sec.appex1.databinding.CellTrendListBinding
import com.sec.appex1.ui.main.home.items.TrendUiItem

class TrendAdapter(var items:ArrayList<TrendUiItem>):RecyclerView.Adapter<TrendVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrendVH {
    val binding=CellTrendListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TrendVH(binding)
    }

    override fun getItemCount(): Int {
       return  items.size
    }

    override fun onBindViewHolder(holder: TrendVH, position: Int) {
        val item=items[position]
      holder.bind(item)
    }
}
package com.sec.appex1.ui.main.home

import androidx.recyclerview.widget.RecyclerView
import com.sec.appex1.databinding.CellTrendListBinding
import com.sec.appex1.ui.main.home.items.TrendUiItem

class TrendVH(var binding: CellTrendListBinding):RecyclerView.ViewHolder(binding.root) {

    fun bind(item:TrendUiItem){
        binding.trendImg.setImageResource(item.trendImg)
        binding.trendTitle.text=item.trendTitle
        binding.trendSubtitle.text=item.trendSubtitle
    }
}
package com.sec.appex1.ui.main.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sec.appex1.R
import com.sec.appex1.ui.main.home.items.TrendUiItem

class HomeViewModel:ViewModel() {
    private val _trendData = MutableLiveData<ArrayList<TrendUiItem>>()
    var trendData:LiveData<ArrayList<TrendUiItem>> = _trendData

    fun generateTrendData(){
        val items= arrayListOf<TrendUiItem>(
            TrendUiItem(
                trendImg = R.drawable.trends,
                trendTitle = "Future in AI, what will tomorrow be like?",
                trendSubtitle ="The National"
            ),
            TrendUiItem(
                trendImg = R.drawable.trends2,
                trendTitle = "Important points in concluding a work contract",
                trendSubtitle ="Reuters"
            ),
            TrendUiItem(
                trendImg = R.drawable.trends,
                trendTitle = "Future in AI, what will tomorrow be like?",
                trendSubtitle ="The National"
            )
        )
        _trendData.value=items
    }

}
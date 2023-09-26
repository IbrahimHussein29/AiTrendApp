package com.sec.appex1.ui.main.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider

import com.sec.appex1.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
private lateinit var binding:FragmentHomeBinding
private lateinit var homeViewModel: HomeViewModel

private val trendAdapter by lazy{
  TrendAdapter(arrayListOf())
}

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding=FragmentHomeBinding.inflate(layoutInflater)
       homeViewModel=ViewModelProvider(this)[HomeViewModel::class.java]

        observeData()
        callData()
        return binding.root

    }

    private fun callData() {
        homeViewModel.generateTrendData()
    }

    private fun observeData() {
 binding.recycler.adapter=trendAdapter
        homeViewModel.trendData.observe(viewLifecycleOwner){
            trendAdapter.items=it
            trendAdapter.notifyDataSetChanged()
        }
    }


}
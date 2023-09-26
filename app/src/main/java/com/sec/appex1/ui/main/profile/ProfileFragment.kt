package com.sec.appex1.ui.main.profile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.sec.appex1.R
import com.sec.appex1.databinding.FragmentProfileBinding
import com.sec.appex1.ui.main.profile.items.ProfileUiItem

class ProfileFragment : Fragment() {
    private lateinit var binding: FragmentProfileBinding
    private lateinit var profileViewModel: ProfileViewModel
    private val profileAdapter by lazy {
        ProfileAdapter(arrayListOf()) {
            handleItemClicked(it)
        }
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfileBinding.inflate(layoutInflater)
        profileViewModel = ViewModelProvider(this)[ProfileViewModel::class.java]

        callData()
        observeData()
        bindData()

        return binding.root
    }

    private fun bindData() {
        binding.profileRecyclerView.adapter=profileAdapter
        binding.backImg.setOnClickListener {
            findNavController().popBackStack()
        }
    }

    private fun observeData() {

        profileViewModel.profileData.observe(viewLifecycleOwner) {
            profileAdapter.items = it
            profileAdapter.notifyDataSetChanged()
        }
    }

    private fun callData() {
        profileViewModel.generateProfileData()
    }

    private fun handleItemClicked(item: ProfileUiItem) {
        //need new fragments
    }


}
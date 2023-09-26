package com.sec.appex1.ui.main.profile

import androidx.recyclerview.widget.RecyclerView
import com.sec.appex1.databinding.CellProfileItemsBinding
import com.sec.appex1.ui.main.profile.items.ProfileUiItem

class ProfileVH (val binding: CellProfileItemsBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(item: ProfileUiItem.ProfileComponentsUi) {
        binding.profileItemImg.setImageResource(item.img)
        binding.profileItemText.text = item.text
        binding.profileItemArrow.setImageResource(item.arrow)

    }
}

package com.sec.appex1.ui.main.profile

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sec.appex1.R
import com.sec.appex1.ui.main.profile.items.ProfileUiItem

class ProfileViewModel:ViewModel() {
    private var _profileData = MutableLiveData<ArrayList<ProfileUiItem>>()
    val profileData: LiveData<ArrayList<ProfileUiItem>> = _profileData

    fun generateProfileData(){
        val items= arrayListOf<ProfileUiItem>()
        items.add(ProfileUiItem.ProfileComponentsUi(
            img = R.drawable.btn_1,
            text = "Notification",
            action = ProfileUiItem.ACTION_NOTIFICATION
        ))

        items.add(ProfileUiItem.ProfileComponentsUi(
            img = R.drawable.btn_2,
            text = "Calender",
            action = ProfileUiItem.ACTION_CALENDER
        ))
        items.add(ProfileUiItem.ProfileComponentsUi(
            img = R.drawable.btn_3,
            text = "Gallery",
            action = ProfileUiItem.ACTION_GALLERY
        ))

        items.add(ProfileUiItem.ProfileComponentsUi(
            img = R.drawable.btn_4,
            text = "My Playlist",
            action = ProfileUiItem.ACTION_MY_PLAYLIST
        ))

        items.add(ProfileUiItem.ProfileComponentsUi(
            img = R.drawable.btn_5,
            text = "Share",
            action = ProfileUiItem.ACTION_SHARE
        ))

        items.add(ProfileUiItem.ProfileComponentsUi(
            img = R.drawable.btn_6,
            text = "Logout",
            action = ProfileUiItem.ACTION_lOG_OUT
        ))



        _profileData.value=items

    }
}
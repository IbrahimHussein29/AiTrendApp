package com.sec.appex1.ui.main.profile.items

import com.sec.appex1.R
import java.io.Serializable

sealed class ProfileUiItem:Serializable{
    data class ProfileComponentsUi(
        val img:Int,
        val text:String,
        val arrow:Int= R.drawable.arrow,
    val action:String
    ): ProfileUiItem()

    companion object {
        const val ACTION_NOTIFICATION = "action_notification"
        const val ACTION_CALENDER = "action_calender"
        const val ACTION_GALLERY = "action_gallery"
        const val ACTION_MY_PLAYLIST = "action_my_playlist"
        const val ACTION_SHARE = "action_share"
        const val ACTION_lOG_OUT = "action_logout"
    }
}

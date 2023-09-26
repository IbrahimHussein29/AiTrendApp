package com.sec.appex1.ui.intro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sec.appex1.R
import com.sec.appex1.databinding.ActivityIntroBinding
import com.sec.appex1.ui.main.MainActivity

class IntroActivity : AppCompatActivity() {
    private lateinit var binding: ActivityIntroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding=ActivityIntroBinding.inflate(layoutInflater)
        setContentView(binding.root)
binding.getStartBtn.setOnClickListener(){
    redirectToMainScreen()
}
    }

    private fun redirectToMainScreen() {
        startActivity(Intent(this, MainActivity::class.java).apply {
            flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
        })
       this.finish()
    }
}
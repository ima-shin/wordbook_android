package com.shinpei.wordbook_android

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shinpei.wordbook_android.activities.auth.LoginActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        signUpBtn.setOnClickListener{ openBrowser() }
        loginBtn.setOnClickListener{ moveToLoginView() }
    }

    private fun moveToLoginView() {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }

    private fun openBrowser() {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://localhost:8080/api/v1.0/auth/temp?token=9fff49d7487c46bfb3a73c33cfc3bab40360eb0214f442f7d369eee129e9d6bf"))
        startActivity(intent)
    }
}
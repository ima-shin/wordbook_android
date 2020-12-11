package com.shinpei.wordbook_android.activities.auth

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.shinpei.wordbook_android.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var data  = this.intent.data
        if (data != null && data.isHierarchical) {
            var uri = this.intent.dataString
            Log.i("Myapp", "Deep link clicked" + uri)
        }
    }
}
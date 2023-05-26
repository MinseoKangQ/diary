package com.project.diary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SigninActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)
        supportActionBar?.show()
    }
}
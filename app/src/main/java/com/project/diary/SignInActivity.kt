package com.project.diary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)
        supportActionBar?.show()

        val signInBtn = findViewById<Button>(R.id.sign_in_button)

        signInBtn.setOnClickListener {
            // 회원가입 로직

            // 화면 전환
            val intent = Intent(this, SignInCompleteActivity::class.java)
            startActivity(intent)

        }
    }
}
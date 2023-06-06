package com.project.diary

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SignInCompleteActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin_complete)
        supportActionBar?.show()

        val login_btn_in_complete = findViewById<Button>(R.id.login_btn_in_complete)

        login_btn_in_complete.setOnClickListener {
            // 화면 전환
            val intent = Intent(this, MainActivity::class.java)
            finishAffinity() // 화면 비우기
            startActivity(intent)

        }
    }
}
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

        val login_btn = findViewById<Button>(R.id.login_btn)

        login_btn.setOnClickListener {
            // 화면 전환
            val intent = Intent(this, MainActivity::class.java)
            finishAffinity() // 기존 스택 비우기, 메인 화면이 MainActivity 가 되도록
            startActivity(intent)

        }
    }
}
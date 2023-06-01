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
            val intent = Intent(this, MainActivity::class.java)
            finishAffinity() // 기존 스택 비우기, 메인 화면이 MainActivity 가 되도록
            startActivity(intent)

        }
    }
}
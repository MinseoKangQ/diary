package com.project.diary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    var id: String = ""
    var pw: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userId = findViewById<EditText>(R.id.id)
        val userPassword = findViewById<EditText>(R.id.pw)
        val loginBtn = findViewById<Button>(R.id.loginBtn)
        val signInTextView = findViewById<TextView>(R.id.signInTv)

        loginBtn.setOnClickListener {

            // 로그인 처리 로직
            // 로그인 성공 시
            if(userId.text.toString() == "a" && userPassword.text.toString() == "1") {
                // 뷰 모델에 아이디 값 전달
                val intent = Intent(this, HomeActivity::class.java)
                finishAffinity() // 로그인 하면 기존 스택 비우기, 메인 화면이 HomeActivity 가 되도록
                startActivity(intent)
            }

            // 로그인 실패 시
            else {
                userId.text = null
                userPassword.text = null
                Toast.makeText(this, "로그인 실패", Toast.LENGTH_SHORT).show()
            }

            // SpringBoot API 이용하는 경우 사용
//            id = userId.text.toString()
//            pw = userPassword.text.toString()
//            val user = User()
//            user.id = userId.text.toString()
//            user.pw = userPassword.text.toString()
//            Login(user)
        }

        signInTextView.setOnClickListener {
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
        }

    }

    // SpringBoot API 이용하는 경우 사용
    fun Login(user: User) {
        val call = RetrofitBuilder.api.getLoginResponse(user)
        call.enqueue(object : Callback<String> {
            override fun onResponse(
                call: Call<String>,
                response: Response<String>
            ) {
                if (response.isSuccessful) {
                    Log.d("RESPONSE: ", response.body().toString())
                } else {
                    Log.d("RESPONSE", "FAILURE")
                }
            }

            override fun onFailure(call: Call<String>, t: Throwable) {
                Log.d("CONNECTION FAILURE: ", t.localizedMessage)
            }
        })
    }

}
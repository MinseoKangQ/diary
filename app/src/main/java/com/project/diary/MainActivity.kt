package com.project.diary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    var id: String = ""
    var pw: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userId = findViewById<EditText>(R.id.id);
        val userPassword = findViewById<EditText>(R.id.pw)
        val loginBtn = findViewById<Button>(R.id.login_button)

        loginBtn.setOnClickListener {
            id = userId.text.toString()
            pw = userPassword.text.toString()
            val user = User()
            user.id = userId.text.toString()
            user.pw = userPassword.text.toString()
            Login(user)
        }
    }

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
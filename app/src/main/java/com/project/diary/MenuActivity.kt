package com.project.diary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.FrameLayout
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MenuActivity : AppCompatActivity() {

    private val fl : FrameLayout by lazy {
        findViewById(R.id.fl)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        Log.d("fragment", "MenuActivity onCreate")

        val bnv_main = findViewById<BottomNavigationView>(R.id.bnv_main)

        bnv_main.setOnItemSelectedListener { item ->
            changeFragment(
                when (item.itemId) {
                    R.id.home -> { HomeFragment() }
                    R.id.calendar -> { CalendarFragment() }
                    R.id.settings -> { SettingsFragment() }
                    else -> { false }
                } as Fragment
            )
            true
        }
        bnv_main.selectedItemId = R.id.home
    }

    private fun changeFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fl, fragment)
            .commit()
    }
}
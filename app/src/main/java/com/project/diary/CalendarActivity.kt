package com.project.diary

import android.os.Bundle
import android.util.Log
import android.widget.CalendarView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CalendarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_calendar)

        val todayView = findViewById<TextView>(R.id.todayView)
        val calendarView = findViewById<CalendarView>(R.id.calendarView)

        todayView.text = "선택"

        Log.d("12345", "${todayView.text}")
//        val formatter = SimpleDateFormat("yyyy년 MM월 dd일")
//        val date = Date(calendarView.date)
//        todayView.setText("${formatter.format(date)}")
//
//        calendarView.setOnDateChangeListener { _, year, month, dayOfMonth ->
//            val day = "${year}년 ${month + 1}월 ${dayOfMonth}일"
//            todayView.text = day
//        }
    }
}
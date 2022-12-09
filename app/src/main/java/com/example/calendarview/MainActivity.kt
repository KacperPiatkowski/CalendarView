package com.example.calendarview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CalendarView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var kalendarz = findViewById<CalendarView>(R.id.kalendarzView);
        var WyjazdPrzycisk = findViewById<Button>(R.id.buttonWyjazd);
        var PowrotPrzycisk = findViewById<Button>(R.id.buttonPowrot);
        var WyjazdView = findViewById<TextView>(R.id.textViewWyjazd);
        var PowrotView = findViewById<TextView>(R.id.textViewPowrot);

        var data = arrayListOf<Int>(0,0,0)

    }
}
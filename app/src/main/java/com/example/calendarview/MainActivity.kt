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
        kalendarz.setOnDateChangeListener { calendarView, i, i2, i3 ->
            data[0] = i
            data[1] = i2
            data[2] = i3
        }

        kalendarz.minDate = kalendarz.date
        kalendarz.maxDate = kalendarz.date + (8460000 * 730)

    }
}
package com.example.school_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {

    var spinner_civil_status = arrayOf("Single", "Married")
    lateinit var spinner : Spinner
    lateinit var btn_save : Button
    lateinit var btn_cancel : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        spinner = findViewById(R.id.spinner)

        val adapter = ArrayAdapter(this,android.R.layout.simple_spinner_item, spinner_civil_status)
        spinner.adapter = adapter

        btn_save = findViewById(R.id.button3)
        btn_cancel = findViewById(R.id.button4)

        btn_save.setOnClickListener(View.OnClickListener {
            Toast.makeText(this,"Saved",Toast.LENGTH_SHORT).show()
        })

        btn_cancel.setOnClickListener(View.OnClickListener {
            Toast.makeText(this,"Cancel",Toast.LENGTH_SHORT).show()
        })
    }
}
package com.example.school_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    lateinit var btn_next: Button
    lateinit var spinner_gender: Spinner
    var spinner_gender_list = arrayOf("Male", "Female", "Others")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_next = findViewById(R.id.btn_next);

        btn_next.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

        // name of the spinner
        spinner_gender = findViewById(R.id.spinner3)

        val adapter = ArrayAdapter(this,android.R.layout.simple_spinner_item, spinner_gender_list)
        spinner_gender.adapter = adapter
    }


}
package com.example.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val continue1=findViewById<TextView>(R.id.continue1)
        val play=findViewById<TextView>(R.id.play)
        val number=findViewById<TextView>(R.id.number)

        play.setOnClickListener {
            var num=number.text.toString().toInt()
            num++
            number.text=num.toString()
        }

        continue1.setOnClickListener {
            Toast.makeText(this, "congrats!", Toast.LENGTH_LONG).show()
        }
    }
}
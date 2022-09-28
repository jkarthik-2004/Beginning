package com.example.beginning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val userName = intent.getStringExtra("USER")
        val textView = findViewById<TextView>(R.id.tvOffer)
        val message = "$userName,you will get free access to all the courses for 1 month"
        textView.text = message
    }
    override fun onStart() {
        super.onStart()
        Log.i("MYTAG","MainActivity2 : onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("MYTAG","MainActivity2 : onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("MYTAG","MainActivity2 : onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MYTAG","MainActivity2 : onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MYTAG","MainActivity2 : onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("MYTAG","MainActivity2 : onRestart")
    }
}
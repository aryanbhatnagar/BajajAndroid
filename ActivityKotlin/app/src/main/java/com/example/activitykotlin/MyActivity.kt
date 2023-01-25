package com.example.activitykotlin

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MyActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("MyActivity", "onCreate()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MyActivity", "onRestart")
    }


    override fun onStart() {
        super.onStart()
         Log.d("MyActivity", "onStart")
    }


    override fun onResume() {
        super.onResume()
        Log.d("MyActivity", "onResume")
    }




    override fun onPause() {
        super.onPause()
        Log.d("MyActivity", "onPause")
    }


    override fun onStop() {
       super.onStop()
        Log.d("MActivity", "onStop")
    }

     override fun onDestroy() {
        super.onDestroy()
        Log.d("MyActivity", "onDestroy")
    }
}

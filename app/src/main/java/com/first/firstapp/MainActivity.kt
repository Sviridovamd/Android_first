package com.first.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import android.widget.TextView



class MainActivity : AppCompatActivity() {

    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.first.firstapp.R.layout.activity_main)
        textView = findViewById(com.first.firstapp.R.id.textView)
    }


    override fun onSaveInstanceState(outState: Bundle) {

        outState.run {
            putString("KEY", textView.text.toString())
        }

        super.onSaveInstanceState(outState)
    }


    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        textView.text = savedInstanceState.getString("KEY")
    }





    fun toastMe(view: View) {
        // val myToast = Toast.makeText(this, message, duration);
        val myToast = Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT)
        myToast.show()
    }

    fun countMe (view: View) {
        // Get the value of the text view.
        val countString = textView.text.toString()
        // Convert value to a number and increment it
        var count: Int = Integer.parseInt(countString)
        count++
        // Display the new value in the text view.
        textView.text = count.toString();

    }

    fun restMe (view: View) {
        // Get the value of the text view.
        val countString = textView.text.toString()
        // Convert value to a number and increment it
        var count: Int = Integer.parseInt(countString)
        count = 0
        // Display the new value in the text view.
        textView.text = count.toString();
    }


    fun randomMe (view: View) {

// Create an Intent to start the second activity

        val randomIntent = Intent(this, MainActivityRandom::class.java)



// Get the current value of the text view.

        val countString = textView.text.toString()



// Convert the count to an int

        val count = Integer.parseInt(countString)



// Add the count to the extras for the Intent.

        randomIntent.putExtra(MainActivityRandom.TOTAL_COUNT, count)



// Start the new activity.

        startActivity(randomIntent)

    }




}







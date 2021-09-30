package com.first.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlin.random.Random as RandomRandom


class MainActivityRandom : AppCompatActivity() {

    private lateinit var textViewRandom: TextView
    private lateinit var textViewLabel: TextView

    companion object {

        const val TOTAL_COUNT = "total_count"

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_random)
        textViewRandom = findViewById(R.id.textViewRandom)
        textViewLabel = findViewById(R.id.textViewLabel)

        showRandomNumber()
    }




    fun showRandomNumber() {

        // Get the count from the intent extras

        val count = intent.getIntExtra(TOTAL_COUNT, 0)



        // Generate the random number

        val random = RandomRandom(count)

        var randomInt = 0

        // Add one because the bound is exclusive

        if (count > 0) {

            // Add one because the bound is exclusive

            randomInt = random.nextInt(count + 1)

        }



        // Display the random number.

        textViewRandom.text = Integer.toString(randomInt)



        // Substitute the max value into the string resource

        // for the heading, and update the heading

        textViewLabel .text = getString(R.string.random_title, count)

    }
}
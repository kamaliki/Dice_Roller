package com.example.dice_roller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    //create a lateinit variable for the dice image
    lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //create a variable to hold the button
        val rollButton: Button = findViewById(R.id.roll_button)
        //rollButton.text = "Let's Roll"
        //set an onclick listener to the button
        rollButton.setOnClickListener {
            //Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
            rollDice()
        }
        //a variable for the image view
        diceImage = findViewById(R.id.dice_image)

    }

    private fun rollDice() {

        val randomInt = (1..6).random()
        //use when expression to set the image
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        //set the image resource to the image view
        diceImage.setImageResource(drawableResource)

    }
}
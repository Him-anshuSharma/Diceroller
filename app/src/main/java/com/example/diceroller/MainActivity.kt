package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.roll_button)
        val imageView = findViewById<ImageView>(R.id.imageView)

        button.setOnClickListener{
            val rollValue = rollDice()
            Toast.makeText(applicationContext,"You Rolled $rollValue",Toast.LENGTH_SHORT).show()
            when(rollValue){
                1 -> imageView.setBackgroundResource(R.drawable.dice_1)
                2 -> imageView.setBackgroundResource(R.drawable.dice_2)
                3 -> imageView.setBackgroundResource(R.drawable.dice_3)
                4 -> imageView.setBackgroundResource(R.drawable.dice_4)
                5 -> imageView.setBackgroundResource(R.drawable.dice_5)
                6 -> imageView.setBackgroundResource(R.drawable.dice_6)
            }
        }

    }

    private fun rollDice():Int{
        return (Math.random()*5+1).toInt()
    }

}
package com.example.app2_diceroller

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

/**
 * This activity allows the user to roll a dice and view the result
 * on the screen.
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }
    }
    /**
     * Roll the dice and update the screen with the result.
     */
    private fun rollDice() {
        // Create new Dice object with 6 sides and roll it
        val dice1 = Dice(6)
        val diceRoll1 = dice1.roll()
        // Update the screen with the dice roll
//        val resultTextView1: TextView = findViewById(R.id.textView1)
//        resultTextView1.text = diceRoll1.toString()
    }
}

class Dice(private val sumSides: Int) {
    fun roll(): Int {
        return (1..sumSides).random()
    }
}
package com.example.exam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var counter=0
    lateinit var number:TextView
    lateinit var display:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        number=findViewById(R.id.number)
        display=findViewById(R.id.display)

        counter()

        var plus=findViewById<Button>(R.id.plus)
        var minus=findViewById<Button>(R.id.minus)

        plus.setOnClickListener { view -> plus() }
        minus.setOnClickListener { view -> minus() }

    }

    fun plus(){
        counter++
        counter()
        fizzBuzz()
    }

    fun minus(){
        counter--
        counter()
        fizzBuzz()
    }

    fun counter(){
        number.text=counter.toString()
    }

    fun fizzBuzz() {
        val fizzBuzzMessage = when {
            counter % 3 == 0 && counter % 5 == 0 -> "FizzBuzz"
            counter % 3 == 0 -> "Fizz"
            counter % 5 == 0 -> "Buzz"
            else -> ""
        }
        display.text=fizzBuzzMessage
    }


}
package com.example.a4april2024_imad5112_assignment_1_new_thivar_munien_st10271490

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    //declare
    private lateinit var searchButton: Button
    private lateinit var resultTextView:TextView
    private lateinit var ageInput: EditText
    private lateinit var clearButton:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        //initialise
        searchButton= findViewById(R.id.searchButton)
        clearButton = findViewById(R.id.clearButton)
        ageInput = findViewById(R.id.ageInput)
        resultTextView= findViewById(R.id.resultTextView)


        searchButton.setOnClickListener {
            val age = ageInput.text.toString().toIntOrNull()

            if (age != null && age in 20..100) {
                val employeeName = when (age) {
                    42 -> "Elvis Aaron Presly "
                    36 -> " Princess Diana"
                    45 -> "Freddie Mercury"
                    50 -> "Michael Jackson"
                    65 -> "Bob Saget"
                    30 -> "Andy Gibb"
                    62 -> "Robin Gibb"
                    53 -> "Maurice Gibb"
                    94 -> "Willie Nelson"
                    96 -> "Queen Elizabeth"
                    else -> null
                }

                val message = if (employeeName != null) "The people's name is $employeeName."
                else "No person found with the entered age."
                resultTextView.text = message

            } else {
                resultTextView.text = "Invalid input. Please enter a valid age between 20 and 100."
            }
        }

        clearButton.setOnClickListener {
            ageInput.text.clear()
            resultTextView.text = ""
        }
    }
}

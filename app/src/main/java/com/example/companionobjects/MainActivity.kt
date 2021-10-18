package com.example.companionobjects

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.AdapterView

import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainConstraintLayout = findViewById<ConstraintLayout>(R.id.cl_main)
        val spinner = findViewById<Spinner>(R.id.spinner_dayOrNight)
        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, Utilities.timeArray)


        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = arrayAdapter

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                mainConstraintLayout.setBackgroundResource(Utilities.getBackground(spinner.selectedItem.toString()))
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                Toast.makeText(this@MainActivity, "please select a time", Toast.LENGTH_SHORT).show()
            }
        }


    }
}


package com.example.companionobjects

import android.view.View

class Utilities {
    companion object {

        val timeArray = arrayOf("Day", "Night")

        fun changeBackground(time: String,view : View){
            when (time) {
                "Day" ->  view.setBackgroundResource(R.drawable.day)
                "Night" -> view.setBackgroundResource(R.drawable.night)
                else -> view.setBackgroundResource(R.drawable.day)

            }
        }
    }
}
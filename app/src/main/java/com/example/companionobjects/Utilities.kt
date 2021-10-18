package com.example.companionobjects

class Utilities {
    companion object {
        val timeArray = arrayOf("Day", "Night")
        fun getBackground(time: String): Int {
            return when (time) {
                "Day" -> R.drawable.day

                "Night" -> R.drawable.night

                else -> R.drawable.day

            }
        }
    }
}
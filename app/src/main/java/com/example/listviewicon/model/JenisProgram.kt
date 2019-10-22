package com.example.listviewicon.model

import com.example.listviewicon.R

object JenisProgram {
    private val programName = arrayOf(
        "Ruby",
        "Rails",
        "Python",
        "Java Script",
        "PHP"
    )

    private val detail = arrayOf(
        "Ruby is an open-source and fully object-oriented programming language.",
        "Ruby on Rails is a server-side web application development framework written in Ruby language",
        "Python is interpreted scripting and object-based scripting language",
        "Javascript is an object-based scripting language",
        "PHP is an interpreted language,i.e.,there is no need for compilation"
    )

    private val programPoster = intArrayOf(
        R.drawable.ruby,
        R.drawable.rails,
        R.drawable.python,
        R.drawable.js,
        R.drawable.php

    )

    val listProgram: ArrayList<Program>
        get() {
            val list = arrayListOf<Program>()
            for (position in programName.indices) {
                val program = Program()
                program.name = programName[position]
                program.detail = detail[position]
                program.poster = programPoster[position]
                list.add(program)
            }
            return list
        }
}
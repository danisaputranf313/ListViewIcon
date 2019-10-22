package com.example.listviewicon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listviewicon.adapter.ListProgramAdapter
import com.example.listviewicon.model.Program
import com.example.listviewicon.model.JenisProgram
import com.example.listviewicon.model.JenisProgram.listProgram

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var rvProgram: RecyclerView
    private var list: ArrayList<Program> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvProgram = findViewById(R.id.rv_Program)
        rvProgram.setHasFixedSize(true)
        list.addAll(JenisProgram.listProgram)
        showProgramList()
    }

    private fun showProgramList() {
        rvProgram.layoutManager = LinearLayoutManager(this)
        val listProgramAdapter = ListProgramAdapter(list)
        rvProgram.adapter = listProgramAdapter
    }
}

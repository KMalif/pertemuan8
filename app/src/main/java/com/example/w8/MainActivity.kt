    package com.example.w8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.w8.adapter.TodoAdapter
import com.example.w8.databinding.ActivityMainBinding
import com.example.w8.model.Todo

    class MainActivity : AppCompatActivity() {

        private lateinit var binding: ActivityMainBinding
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivityMainBinding.inflate(layoutInflater)
            setContentView(binding.root)

        val todoList = mutableListOf(
            Todo("yuuu", false),
            Todo("y", false)
        )

        val adapter = TodoAdapter(todoList)
        binding.rvlist.adapter = adapter
        binding.rvlist.layoutManager = LinearLayoutManager(this)

        binding.btn.setOnClickListener {
            val title = binding.editList.text.toString()
            val todo = Todo(title, false)
            todoList.add(todo)
            adapter.notifyDataSetChanged()
            adapter.notifyItemInserted(todoList.size-1)

        }
    }




}
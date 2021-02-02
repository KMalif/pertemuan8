package com.example.w8.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.w8.databinding.ListTodoBinding
import com.example.w8.model.Todo

class TodoAdapter  (
    var todos: List<Todo>) : RecyclerView.Adapter<TodoAdapter.TodoViewHolder>() {
    inner class TodoViewHolder(val binding: ListTodoBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        return TodoViewHolder(ListTodoBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return todos.size
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        holder.binding.apply {
            tvTitle2.text = todos[position].title
            cb.isChecked = todos[position].isChecked
        }

    }
}
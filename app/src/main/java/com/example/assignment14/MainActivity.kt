package com.example.assignment14

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvContact:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        displayContact()
    }
    fun displayContact(){
        var contactList= listOf<contact>(
            contact("Rahma","0729869150","rahmafaiz@gmail.com","https://images.unsplash.com/photo-1626176297172-67b0330d7b97?ixid=MnwxMjA3fDB8MHxlZGl0b3JpYWwtZmVlZHwzNHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=400&q=60"),
            contact("Hamdi","0737898790","abdullahihamdi@gmail.com","https://images.unsplash.com/photo-1626126126742-2a5bcdba60dd?ixid=MnwxMjA3fDB8MHxlZGl0b3JpYWwtZmVlZHw0NXx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=400&q=60"),
            contact("Mercy","0726789090","mercyhum@gmail.com","https://images.unsplash.com/photo-1626111908232-68c62814b096?ixid=MnwxMjA3fDB8MHxlZGl0b3JpYWwtZmVlZHw1Nnx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=400&q=60"),
            contact("Azmi","0111127896","azmiyeabaz@gmail.com","https://images.unsplash.com/photo-1626127115026-8ba4004e371c?ixid=MnwxMjA3fDB8MHxlZGl0b3JpYWwtZmVlZHwxMjJ8fHxlbnwwfHx8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=400&q=60")
        )
        rvContact= findViewById(R.id.rvContact)
        var contactAdapter = contactrvadapter(contactList)
        rvContact.layoutManager = LinearLayoutManager(baseContext)
        rvContact.adapter = contactAdapter
    }
}
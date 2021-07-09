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
            contact("Rahma","0729869150","rahmafaiz@gmail.com"),
            contact("Hamdi","0737898790","abdullahihamdi@gmail.com"),
            contact("Mercy","0726789090","mercyhum@gmail.com"),
            contact("Azmi","0111127896","azmiyeabaz@gmail.com")
        )
        rvContact= findViewById(R.id.rvContact)
        var contactAdapter = contactrvadapter(contactList)
        rvContact.layoutManager = LinearLayoutManager(baseContext)
        rvContact.adapter = contactAdapter
    }
}
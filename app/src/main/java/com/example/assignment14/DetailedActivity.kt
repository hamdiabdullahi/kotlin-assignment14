package com.example.assignment14

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.squareup.picasso.Picasso

class DetailedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed)
        var nameintent= intent.getStringExtra("name")
        var phoneintent=intent.getStringExtra("phonenumber")
        var emailintent=intent.getStringExtra("email")
        var imageintent=intent.getStringExtra("imageUrl")



        val names=findViewById<TextView>(R.id.tvnames)
        val phones=findViewById<TextView>(R.id.tvphones)
        val emails=findViewById<TextView>(R.id.tvemails)
        val images=findViewById<ImageView>(R.id.imgimages)


        names.text=nameintent
        phones.text=phoneintent
        emails.text=emailintent

        Picasso.get().load(imageintent).into(images)






//        Toast.makeText(baseContext,name,Toast.LENGTH_LONG).show()
    }
}
package com.example.assignment14

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlin.coroutines.coroutineContext

class contactrvadapter (var contactList: List<contact>):RecyclerView.Adapter<contactsViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): contactsViewHolder {
            var itemView =LayoutInflater.from(parent.context).inflate(R.layout.contact_list_item,parent,false)

            return contactsViewHolder(itemView)
        }

        override fun onBindViewHolder(holder: contactsViewHolder, position: Int) {
            var currentContact = contactList.get(position)
            holder.tvname.text=currentContact.name
            holder.tvphonenumber.text=currentContact.phonenumber
            holder.tvEmail.text = currentContact.email
            Picasso.get()

                .load(currentContact.imageUrl)
                .resize(80,80)
                .centerCrop()
                .into(holder.ivcontacts)



           holder.cvcontact.setOnClickListener {
                var intent=Intent(context,DetailedActivity::class.java)
                intent.putExtra("name",currentContact.name)
                intent.putExtra("phonenumber",currentContact.phonenumber)
                intent.putExtra("email",currentContact.email)
                intent.putExtra("image",currentContact.imageUrl)
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                context.startActivity(intent)
            }





        }

        override fun getItemCount(): Int {
            return contactList.size
        }
    }
    class contactsViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
        var tvname = itemView.findViewById<TextView>(R.id.tvNameLbl)
        var tvphonenumber=itemView.findViewById<TextView>(R.id.tvphonenumber)
        var tvEmail =itemView.findViewById<TextView>(R.id.tvEmailLbl)
        var ivcontacts=itemView.findViewById<ImageView>(R.id.ivcontacts)
        var cvcontact=itemView.findViewById<CardView>(R.id.cvcontact)
    }


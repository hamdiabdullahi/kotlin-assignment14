package com.example.assignment14

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

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
        }

        override fun getItemCount(): Int {
            return contactList.size
        }
    }
    class contactsViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
        var tvname = itemView.findViewById<TextView>(R.id.tvNameLbl)
        var tvphonenumber=itemView.findViewById<TextView>(R.id.tvphonenumber)
        var tvEmail =itemView.findViewById<TextView>(R.id.tvEmailLbl)
    }


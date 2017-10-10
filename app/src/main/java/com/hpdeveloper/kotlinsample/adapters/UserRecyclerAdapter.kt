package com.hpdeveloper.kotlinsample.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hpdeveloper.kotlinsample.R
import com.hpdeveloper.kotlinsample.entities.User
import com.hpdeveloper.kotlinsample.interfaces.UserSelection
import kotlinx.android.synthetic.main.list_item.view.*

/**
 * Created by hirenpatel on 09/10/17.
 */
class UserRecyclerAdapter(val userList: ArrayList<User>, val listener: UserSelection) : RecyclerView.Adapter<UserRecyclerAdapter.UserViewHolder>() {

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.bindItems(userList[position])
    }

    override fun getItemCount(): Int = userList.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return UserViewHolder(v, listener);
    }

    class UserViewHolder(itemView: View, val listener: UserSelection) : RecyclerView.ViewHolder(itemView) {
        fun bindItems(user: User) {
            itemView.textViewUsername.text = user.name;
            itemView.textViewAddress.text = user.address;
            itemView.setOnClickListener(object : View.OnClickListener {
                override fun onClick(v: View) {
                    listener.onUserSelected(user)
                }
            })
        }

    }
}
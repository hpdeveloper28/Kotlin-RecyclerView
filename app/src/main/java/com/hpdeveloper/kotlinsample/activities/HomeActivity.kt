package com.hpdeveloper.kotlinsample.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.hpdeveloper.kotlinsample.R
import com.hpdeveloper.kotlinsample.adapters.UserRecyclerAdapter
import com.hpdeveloper.kotlinsample.entities.User
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val users = ArrayList<User>()
        users.add(User("Hiren", "Ahmedabad"))
        users.add(User("Akash", "Ahmedabad"))
        users.add(User("Abhishek", "Junagadh"))
        users.add(User("Kirit", "Ahmedabad"))
        users.add(User("Sagar", "Visnagar"))
        users.add(User("Pushp", "Rajkot"))

        val userAdapter = UserRecyclerAdapter(users)
        recyclerView.adapter = userAdapter
    }
}

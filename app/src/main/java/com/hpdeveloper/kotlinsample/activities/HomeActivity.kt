package com.hpdeveloper.kotlinsample.activities

import android.os.Bundle
import com.hpdeveloper.kotlinsample.R
import com.hpdeveloper.kotlinsample.adapters.UserRecyclerAdapter
import com.hpdeveloper.kotlinsample.entities.User
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : BaseActivity(){
    override fun getLayout(): Int {
        return R.layout.activity_home;
    }

    override fun activityOnCreate(savedInstanceState: Bundle?) {

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

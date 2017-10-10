package com.hpdeveloper.kotlinsample.activities

import android.os.Bundle
import android.widget.Toast
import com.hpdeveloper.kotlinsample.R
import com.hpdeveloper.kotlinsample.adapters.UserRecyclerAdapter
import com.hpdeveloper.kotlinsample.entities.MathsEntity
import com.hpdeveloper.kotlinsample.entities.User
import com.hpdeveloper.kotlinsample.interfaces.UserSelection
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : BaseActivity(), UserSelection {
    override fun onUserSelected(user: User) {
        Toast.makeText(this, user.name, Toast.LENGTH_SHORT).show()
    }

    override fun getLayout(): Int = R.layout.activity_home

    override fun activityOnCreate(savedInstanceState: Bundle?) {

        val users = ArrayList<User>()
        users.add(User("Hiren", "Ahmedabad"))
        users.add(User("Akash", "Ahmedabad"))
        users.add(User("Abhishek", "Junagadh"))
        users.add(User("Kirit", "Ahmedabad"))
        users.add(User("Sagar", "Visnagar"))
        users.add(User("Pushp", "Rajkot"))

        val userAdapter = UserRecyclerAdapter(users, this)
        recyclerView.adapter = userAdapter

        sumTwoNums();
    }

    /**
     * Call entity function by creating new function
     */
    private fun sumTwoNums() {
        MathsEntity().sum(3, 4)
    }


}



package com.hpdeveloper.kotlinsample.interfaces

import com.hpdeveloper.kotlinsample.entities.User

/**
 * Created by hirenpatel on 10/10/17.
 */
interface UserSelection {

    fun onUserSelected(user : User)
}
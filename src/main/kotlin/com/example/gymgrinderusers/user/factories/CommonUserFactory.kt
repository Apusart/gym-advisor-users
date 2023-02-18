package com.example.gymgrinderusers.user.factories

import com.example.gymgrinderusers.user.CommonUser
import com.example.gymgrinderusers.user.User

class CommonUserFactory : UserFactory {
    override fun create(name: String, surname: String): User {
        return CommonUser(name, surname)
    }
}
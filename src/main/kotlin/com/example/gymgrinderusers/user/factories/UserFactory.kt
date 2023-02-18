package com.example.gymgrinderusers.user.factories

import com.example.gymgrinderusers.user.User

interface UserFactory {
    fun create(name: String, surname: String): User
}
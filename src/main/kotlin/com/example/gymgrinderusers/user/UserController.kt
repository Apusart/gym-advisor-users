package com.example.gymgrinderusers.user

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/user")
class UserController {
    @GetMapping
    suspend fun getUsers(): Array<User> {
        return arrayOf(CommonUser("123", "456"))
    }
}
package com.example.gymgrinderusers

import io.swagger.v3.oas.models.OpenAPI
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class GymGrinderUsersApplication {
    @Bean
    open fun openAPIConfiguration(): OpenAPI = OpenAPI()


}

fun main(args: Array<String>) {
    runApplication<GymGrinderUsersApplication>(*args)
}

package org.KotTeam.SecretServer.Controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/")
class UsersResource() {

    @GetMapping(value = arrayOf("/get"))
    fun getUsers() = "aaaaaa"

    @GetMapping(value = arrayOf("/insert/{name}"))
    fun insertUsers(@PathVariable name: String): String {
        return "aaa"
    }
}


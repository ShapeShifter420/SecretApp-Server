package org.KotTeam.SecretServer.Controllers

import org.KotTeam.SecretServer.models.User
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/")
class UsersResource() {

    @GetMapping(value = arrayOf("/get"))
    fun getUsers() = "aaaaaa"

    @PostMapping(value = arrayOf("/insert/{name}"))
    fun insertUsers(@PathVariable name: String): String {
        return "aaa"
    }
    @PostMapping(value = arrayOf("/crateUser/"))
    fun createUser(@RequestBody user: User): String {
        return "aaa"
    }
}
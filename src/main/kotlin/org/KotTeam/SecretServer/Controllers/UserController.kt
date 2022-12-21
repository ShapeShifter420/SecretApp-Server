package org.KotTeam.SecretServer.Controllers

import org.KotTeam.SecretServer.models.User
import org.KotTeam.SecretServer.services.UserService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("users")
class ProductsController(private val userService: UserService) {

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    fun create(@RequestBody user: User) = userService.add(user)

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    fun read(@PathVariable id: Long) = userService.get(id)

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long) = userService.remove(id)
}
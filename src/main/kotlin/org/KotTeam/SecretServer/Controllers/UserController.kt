package org.KotTeam.SecretServer.Controllers

import org.KotTeam.SecretServer.models.User
import org.KotTeam.SecretServer.services.UserService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("users")
class ProductsController(private val userService: UserService) {
    @GetMapping
    fun index() = userService.all()

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody user: User) = userService.add(user)

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    fun read(@PathVariable id: Long) = userService.get(id)

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long) = userService.remove(id)
}
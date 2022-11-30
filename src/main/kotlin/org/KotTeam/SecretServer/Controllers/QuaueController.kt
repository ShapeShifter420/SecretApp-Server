package org.KotTeam.SecretServer.Controllers

import org.KotTeam.SecretServer.models.Message
import org.KotTeam.SecretServer.services.MessageService
import org.KotTeam.SecretServer.services.QuaueService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("quaue")
class QuaueController(private val quaueService: QuaueService) {
    @GetMapping
    fun index() = quaueService.all()

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    fun read(@PathVariable id: Long) = quaueService.getForUser(id)

}
package org.KotTeam.SecretServer.Controllers

import org.KotTeam.SecretServer.models.Message
import org.KotTeam.SecretServer.services.MessageService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("messages")
class MessageController(private val messageService: MessageService) {
    @GetMapping
    fun index() = messageService.all()

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody message: Message) = messageService.add(message)

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.FOUND)
    fun read(@PathVariable id: Long) = messageService.get(id)

    @DeleteMapping("{id}")
    fun delete(@PathVariable id: Long) = messageService.remove(id)
}
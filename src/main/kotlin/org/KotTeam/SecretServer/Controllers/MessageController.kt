package org.KotTeam.SecretServer.Controllers

import org.KotTeam.SecretServer.models.Message
import org.KotTeam.SecretServer.services.MessageService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("messages")
class MessageController(private val messageService: MessageService) {

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    fun create(@RequestBody message: Message) = messageService.add(message)

    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    fun read(@PathVariable id: Long,@RequestParam token:String)  = messageService.get(id,token)
}
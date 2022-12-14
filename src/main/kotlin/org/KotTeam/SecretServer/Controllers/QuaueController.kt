package org.KotTeam.SecretServer.Controllers

import org.KotTeam.SecretServer.models.Message
import org.KotTeam.SecretServer.services.MessageService
import org.KotTeam.SecretServer.services.QuaueService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("quaue")
class QuaueController(private val quaueService: QuaueService) {
    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    fun read(@PathVariable id: Long,@RequestParam token:String) = quaueService.getForUser(id,token)


}
package org.KotTeam.SecretServer.services

import org.KotTeam.SecretServer.models.Message
import org.KotTeam.SecretServer.models.Quaue
import org.KotTeam.SecretServer.models.User
import org.KotTeam.SecretServer.repos.MessageRepo
import org.KotTeam.SecretServer.repos.QuaueRepo
import org.springframework.stereotype.Service

@Service
class MessageService(private val messageRepo: MessageRepo,private val quauRepo: QuaueRepo,private val userService: UserService) {
    fun all(): Iterable<Message> = messageRepo.findAll()

    fun get(id: Long,token:String): Message {val message = messageRepo.findById(id).get()
        if (userService.check(message.recieverId,token))
        return message
        return Message(0,0,0,"Error for token",0,false)}
    fun add(message: Message): Message {
        val mes = messageRepo.save(message)
        quauRepo.save(Quaue(0L,message.recieverId,message.id,0L))
        return mes}
}
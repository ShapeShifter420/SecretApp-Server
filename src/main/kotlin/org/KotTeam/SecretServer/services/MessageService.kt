package org.KotTeam.SecretServer.services

import org.KotTeam.SecretServer.models.Message
import org.KotTeam.SecretServer.models.Quaue
import org.KotTeam.SecretServer.models.User
import org.KotTeam.SecretServer.repos.MessageRepo
import org.KotTeam.SecretServer.repos.QuaueRepo
import org.springframework.stereotype.Service

@Service
class MessageService(private val messageRepo: MessageRepo,private val quauRepo: QuaueRepo) {
    fun all(): Iterable<Message> = messageRepo.findAll()

    fun get(id: Long): Message = messageRepo.findById(id).get()
    fun add(message: Message): Message {
        val mes = messageRepo.save(message)
        quauRepo.save(Quaue(0L,message.id,message.recieverId,0L))
        return mes}
    fun remove(id: Long) = messageRepo.delete(this.get(id))
}
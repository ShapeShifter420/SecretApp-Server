package org.KotTeam.SecretServer.services

import org.KotTeam.SecretServer.models.Message
import org.KotTeam.SecretServer.repos.MessageRepo
import org.springframework.stereotype.Service

@Service // Позволяем IoC контейнеру внедрять класс
class MessageService(private val messageRepo: MessageRepo) {
    fun all(): Iterable<Message> = messageRepo.findAll()

    fun get(id: Long): Message = messageRepo.findById(id).get()
    fun add(message: Message): Message = messageRepo.save(message)

    fun remove(id: Long) = messageRepo.delete(this.get(id))
}
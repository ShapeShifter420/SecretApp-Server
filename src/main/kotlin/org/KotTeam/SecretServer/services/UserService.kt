package org.KotTeam.SecretServer.services

import org.KotTeam.SecretServer.models.User
import org.KotTeam.SecretServer.repos.UserRepo
import org.springframework.stereotype.Service

@Service // Позволяем IoC контейнеру внедрять класс
class UserService(private val userRepo: UserRepo) { // Внедряем репозиторий в качестве зависимости
    fun all(): Iterable<User> = userRepo.findAll() // Возвращаем коллекцию сущностей, функциональная запись с указанием типа

    fun get(id: Long): User = userRepo.findById(id).get()

    fun add(user: User): User = userRepo.save(user)

    fun remove(id: Long) = userRepo.delete(this.get(id))
}
package org.KotTeam.SecretServer.services

import org.KotTeam.SecretServer.models.User
import org.KotTeam.SecretServer.repos.UserRepo
import org.springframework.stereotype.Service

@Service
class UserService(private val userRepo: UserRepo) {
    //fun all(): Iterable<User> = userRepo.findAll()

    fun get(id: Long): User {val user:User =  userRepo.findById(id).get();
    user.token = "";
    return  user}

    fun add(user: User): User = userRepo.save(user)

    fun check(id:Long,token:String):Boolean{
        return (userRepo.findById(id).get().token == token)
    }
    fun remove(id: Long) = userRepo.delete(this.get(id))
}
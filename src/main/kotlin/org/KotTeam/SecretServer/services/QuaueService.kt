package org.KotTeam.SecretServer.services


import org.KotTeam.SecretServer.models.Quaue
import org.KotTeam.SecretServer.repos.QuaueRepo
import org.springframework.stereotype.Service

@Service
class QuaueService(private val quaueRepo: QuaueRepo,private val userService: UserService) {
    fun all(): Iterable<Quaue> = quaueRepo.findAll()
    fun getForUser(id:Long,token:String):Iterable<Quaue> { if (userService.check(id,token))
        return quaueRepo.findAll().filter { quaue: Quaue? -> quaue?.userId == id }
        return ArrayList<Quaue>()}
    fun get(id: Long): Quaue = quaueRepo.findById(id).get()
    fun add(quaue: Quaue): Quaue = quaueRepo.save(quaue)
}
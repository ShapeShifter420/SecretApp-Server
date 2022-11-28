package org.KotTeam.SecretServer.services


import org.KotTeam.SecretServer.models.Quaue
import org.KotTeam.SecretServer.repos.QuaueRepo
import org.springframework.stereotype.Service

@Service
class QuaueService(private val quaueRepo: QuaueRepo) {
    fun all(): Iterable<Quaue> = quaueRepo.findAll()
    fun getForUser(id:Long):Iterable<Quaue> = quaueRepo.findAll().filter { quaue: Quaue? -> quaue?.userId == id }
    fun get(id: Long): Quaue = quaueRepo.findById(id).get()
    fun add(quaue: Quaue): Quaue = quaueRepo.save(quaue)
    fun remove(id: Long) = quaueRepo.delete(this.get(id))
}
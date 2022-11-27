package org.KotTeam.SecretServer.models

import com.fasterxml.jackson.annotation.JsonProperty
import javax.persistence.*

@Entity // Указывает на то что этот класс описывает модель данных
@Table(name = "messages")
data class Message (
    @Id
    @JsonProperty("id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id:Int,
    @Column(name = "reciever")
    val recieverId:Long,
    @Column(name = "sender")
    val senderId:Long,
    @Column(name = "text")
    val messageText :String,
    @Column(name = "timestamp")
    val timestamp:Long,
    @Column(name = "eddited")
    val isEddited:Boolean,
)
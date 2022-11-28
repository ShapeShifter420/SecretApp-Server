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
    @JsonProperty("reciever")
    @Column(name = "reciever")
    val recieverId:Long,
    @JsonProperty("sender")
    @Column(name = "sender")
    val senderId:Long,
    @JsonProperty("text")
    @Column(name = "text")
    val messageText :String,
    @JsonProperty("timestamp")
    @Column(name = "timestamp")
    val timestamp:Long,
    @JsonProperty("edited")
    @Column(name = "eddited")
    val isEddited:Boolean,
)
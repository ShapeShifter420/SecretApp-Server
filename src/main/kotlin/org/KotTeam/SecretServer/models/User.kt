package org.KotTeam.SecretServer.models

import javax.persistence.*
import com.fasterxml.jackson.annotation.*

@Entity // Указывает на то что этот класс описывает модель данных
@Table(name = "users")
data class User(
    @Id
    @JsonProperty("id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long = 0L,
    @Column(name = "name")
    var name:String = ""
)
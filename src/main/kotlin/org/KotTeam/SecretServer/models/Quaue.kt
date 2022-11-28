package org.KotTeam.SecretServer.models

import com.fasterxml.jackson.annotation.JsonProperty
import java.sql.Timestamp
import javax.persistence.*

@Entity // Указывает на то что этот класс описывает модель данных
@Table(name = "quaue")
data class Quaue (
    @Id
    @JsonProperty("id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long = 0L,
    @JsonProperty("userId")
    @Column(name = "userId")
    var userId: Long = 0L,
    @JsonProperty("messageId")
    @Column(name = "messageId")
    var messageId:Long = 0L,
    @JsonProperty("timestamp")
    @Column(name = "timestamp")
    var timestamp: Long
)
package org.KotTeam.SecretServer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SecretServerApplication

fun main(args: Array<String>) {
	runApplication<SecretServerApplication>(*args)
}

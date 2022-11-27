package org.KotTeam.SecretServer.repos

import org.KotTeam.SecretServer.models.Message
import org.springframework.data.repository.CrudRepository;

interface MessageRepo : CrudRepository<Message, Long>
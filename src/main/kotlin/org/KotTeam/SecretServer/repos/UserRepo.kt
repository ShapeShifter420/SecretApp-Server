package org.KotTeam.SecretServer.repos

import org.KotTeam.SecretServer.models.User

import org.springframework.data.repository.CrudRepository;

interface UserRepo : CrudRepository<User, Long>
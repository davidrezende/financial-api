package com.kotlin.financial.repository

import com.kotlin.financial.model.collection.User
import org.springframework.data.mongodb.repository.MongoRepository
import java.util.*

interface UserRepository : MongoRepository<User, String>{
    fun findByIdUser(user: Long): Optional<User>
}
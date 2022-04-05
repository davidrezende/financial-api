package com.kotlin.financial.repository

import com.kotlin.financial.model.collection.User
import org.springframework.data.mongodb.repository.MongoRepository

interface UserRepository : MongoRepository<User, String>{
}
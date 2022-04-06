package com.kotlin.financial.service

import com.kotlin.financial.model.collection.User
import java.util.*

interface UserService {
    fun save(user: User): User
    fun byId(idUser: Long): Optional<User>
}
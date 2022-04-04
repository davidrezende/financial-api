package com.kotlin.financial.service

import com.kotlin.financial.model.User
import java.util.*

interface UserService {
    fun save(user: User): User
    fun byId(idUser: String): Optional<User>
}
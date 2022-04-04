package com.kotlin.financial.service.impl

import com.kotlin.financial.model.User
import com.kotlin.financial.repository.UserRepository
import com.kotlin.financial.service.UserService
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserServiceImpl(val repository: UserRepository) : UserService {
    override fun save(user: User): User {
        return repository.save(user)
    }

    override fun byId(idUser: String): Optional<User> {
        return repository.findById(idUser)
    }
}
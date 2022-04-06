package com.kotlin.financial.service.impl

import com.kotlin.financial.model.collection.DatabaseSequence
import com.kotlin.financial.model.collection.User
import com.kotlin.financial.repository.UserRepository
import com.kotlin.financial.service.SequenceGeneratorService
import com.kotlin.financial.service.UserService
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserServiceImpl(private val sequenceService: SequenceGeneratorService, val repository: UserRepository) : UserService {
    override fun save(user: User): User {
        user.idUser = sequenceService.generateSequence(user.SEQUENCE_NAME)
        return repository.save(user)
    }

    override fun byId(idUser: Long): Optional<User> {
        return repository.findByIdUser(idUser)
    }
}
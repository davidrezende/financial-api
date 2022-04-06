package com.kotlin.financial.service.impl

import com.kotlin.financial.model.vo.Item
import com.kotlin.financial.repository.UserRepository
import com.kotlin.financial.service.SequenceGeneratorService
import com.kotlin.financial.service.UserService
import com.kotlin.financial.service.WalletService
import org.springframework.stereotype.Service

@Service
class WalletServiceImpl(private val sequenceService: SequenceGeneratorService, private val userService: UserService, private val repository: UserRepository) : WalletService {
    override fun saveItem(user: Long, item: Item) {
        var userFound = userService.byId(user).orElseThrow { Exception("User not found!") }
        item.idItem = sequenceService.generateSequence(item.SEQUENCE_NAME)
        userFound.wallet.add(item)
        repository.save(userFound)
    }
}
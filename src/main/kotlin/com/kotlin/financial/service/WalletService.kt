package com.kotlin.financial.service

import com.kotlin.financial.model.vo.Item

interface WalletService {
    fun saveItem(user: Long, item: Item)
}
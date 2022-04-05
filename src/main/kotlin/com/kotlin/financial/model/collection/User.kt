package com.kotlin.financial.model.collection

import com.kotlin.financial.model.vo.BaseAudit
import com.kotlin.financial.model.vo.Item
import com.kotlin.financial.model.vo.RepeatItem
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "user")
data class User(
    @Id
    val idUser: Long,
    val name: String,
    val email: String,
    val password: String,
    val wallet: List<Item>,
    val scheduleRepeat: List<RepeatItem>
): BaseAudit()
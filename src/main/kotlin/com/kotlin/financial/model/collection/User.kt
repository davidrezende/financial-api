package com.kotlin.financial.model.collection

import com.fasterxml.jackson.annotation.JsonIgnore
import com.kotlin.financial.model.vo.BaseAudit
import com.kotlin.financial.model.vo.Item
import com.kotlin.financial.model.vo.RepeatItem
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "user")
data class User(


    @Transient
    @JsonIgnore var SEQUENCE_NAME: String = "users_sequence",
    @Id
    var idUser: Long,
    val name: String,
    val email: String,
    val password: String,
    var wallet: MutableList<Item> = emptyList<Item>().toMutableList(),
    val scheduleRepeat: MutableList<RepeatItem> = emptyList<RepeatItem>().toMutableList()
): BaseAudit()
package com.kotlin.financial.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*
@Document(collection = "users")
data class User(
    @Id
    val idUser: String,
    val name: String,
    val email: String,
    val password: String
)
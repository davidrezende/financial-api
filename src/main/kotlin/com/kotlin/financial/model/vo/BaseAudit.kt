package com.kotlin.financial.model.vo

import java.time.LocalDateTime

abstract class BaseAudit {
    var creationDate: LocalDateTime = LocalDateTime.now()
    var updateDate: LocalDateTime? = null
}
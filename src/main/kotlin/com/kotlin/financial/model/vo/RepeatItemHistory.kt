package com.kotlin.financial.model.vo

import org.springframework.data.annotation.Id

data class RepeatItemHistory(
    @Id
    val idRepeatItemHistory: Long,
    val idItem: Long?,
): BaseAudit()
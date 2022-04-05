package com.kotlin.financial.model.collection

import com.kotlin.financial.model.vo.BaseAudit
import com.kotlin.financial.model.vo.Item
import com.kotlin.financial.model.vo.RepeatItem
import com.kotlin.financial.model.vo.RepeatItemHistory
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "repeat_history")
data class RepeatHistory (
    @Id
    val idRepeatHistory: Long,
    val idUser: Long,
    val idRepeat: Long,
    val items: List<RepeatItemHistory>
) : BaseAudit()
package com.kotlin.financial.model.vo

import com.fasterxml.jackson.annotation.JsonIgnore
import org.springframework.data.annotation.Id
import java.math.BigDecimal
import java.time.LocalDate
import java.time.LocalDateTime

data class RepeatItem(

    @Transient
    @JsonIgnore val SEQUENCE_NAME: String = "repeat_items_sequence",
    @Id
    val idRepeatItem: Long,
    val description: String,
    val categoryItem: CategoryItem? = CategoryItem.OTHER,
    val type: Type,
    val value: BigDecimal,
    val repeat: RepeatType? = RepeatType.DO_NOT_REPEAT,
    val nextDate: LocalDate = LocalDate.now(),
    val cancelAt: LocalDateTime?,
) : BaseAudit()

enum class RepeatType(value: String){
    MONTHLY("MONTHLY"),
    DAILY("DAILY"),
    DO_NOT_REPEAT("DO_NOT_REPEAT"),
}
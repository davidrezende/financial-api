package com.kotlin.financial.model.vo

import com.fasterxml.jackson.annotation.JsonIgnore
import org.springframework.data.annotation.Id
import java.math.BigDecimal
import java.time.LocalDate

data class Item(

    @Transient
    @JsonIgnore val SEQUENCE_NAME: String = "items_sequence",
    @Id
    var idItem: Long,
    val description: String,
    val categoryItem: CategoryItem? = CategoryItem.OTHER,
    val month: Int? = LocalDate.now().monthValue,
    val year: Int? = LocalDate.now().year,
    val type: Type,
    val value: BigDecimal,
) : BaseAudit()


enum class Type(value: String){
    EXPANSE("EXPANSE"),
    INCOME("INCOME")
}

enum class CategoryItem(value: String){
    SALARY("SALARY"),
    RENT("RENT"), //ALUGUEL
    ENERGY("ENERGY"),
    WATER("WATER"),
    PHONE("PHONE"),
    INTERNET("INTERNET"),
    OTHER("OTHER")
}
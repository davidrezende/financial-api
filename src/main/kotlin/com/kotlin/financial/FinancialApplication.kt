package com.kotlin.financial

import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.info.Info
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FinancialApplication

fun main(args: Array<String>) {
	runApplication<FinancialApplication>(*args)
}

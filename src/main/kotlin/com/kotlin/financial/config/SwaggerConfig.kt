package com.kotlin.financial.config

import io.swagger.v3.oas.models.ExternalDocumentation
import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import io.swagger.v3.oas.models.info.License
import org.springdoc.core.GroupedOpenApi
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class SwaggerConfig {

    @Bean
    fun internalApi(): GroupedOpenApi? {
        return GroupedOpenApi.builder()
            .group("internal-apis")
            .pathsToMatch("/**")
            .build()
    }

    @Bean
    fun springShopOpenAPI(): OpenAPI? {
        return OpenAPI()
            .info(
                Info().title("Financial API")
                    .description("API para gerenciar suas finanças pessoais")
                    .version("v1.0.0")
                    .license(License().name("Apache 2.0").url("http://springdoc.org"))
            )
            .externalDocs(
                ExternalDocumentation()
                    .description("Financial Api Docs")
                    .url("https://github.com/davidrezende/financial-api")
            )
    }
}
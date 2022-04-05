package com.kotlin.financial.entrypoint

import com.kotlin.financial.model.collection.User
import com.kotlin.financial.service.UserService
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.*
import java.util.*

@Tag(name = "UserController V1")
@RestController
@RequestMapping("/v1/user")
class UserController(private val service: UserService) {

    @Operation(summary = "Save new user collection", description = "Returns 201 if successful")
    @ApiResponses(
        value = [
            ApiResponse(responseCode = "201", description = "Successful Operation"),
            ApiResponse(responseCode = "404", description = "Such a user does not exist"),
        ]
    )
    @PostMapping
    fun saveUser(@RequestBody user: User): User {
        return service.save(user)
    }

    @Operation(summary = "Find user by id", description = "Returns 200 if successful")
    @ApiResponses(
        value = [
            ApiResponse(responseCode = "201", description = "Successful Operation"),
            ApiResponse(responseCode = "404", description = "Such a user does not exist"),
        ]
    )
    @GetMapping("/{userId}")
    fun findUser(@PathVariable userId: String): Optional<User> {
        return service.byId(userId)
    }
}
package com.kotlin.financial.entrypoint

import com.kotlin.financial.model.User
import com.kotlin.financial.service.UserService
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/api/v1/user")
class UserController(private val service: UserService) {

    @PostMapping
    fun saveUser(@RequestBody user: User): User {
        return service.save(user)
    }

    @GetMapping("/{userId}")
    fun findUser(@PathVariable userId: String): Optional<User>{
        return service.byId(userId)
    }
}
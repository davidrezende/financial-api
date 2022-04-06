package com.kotlin.financial.entrypoint

import com.kotlin.financial.model.vo.Item
import com.kotlin.financial.service.WalletService
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.web.bind.annotation.*

@Tag(name = "WalletController V1")
@RestController
@RequestMapping("/v1/wallet")
class WalletController(private val service: WalletService) {

    @Operation(summary = "Save new item in a wallet", description = "Returns 201 if successful")
    @ApiResponses(
        value = [
            ApiResponse(responseCode = "201", description = "Successful Operation"),
            ApiResponse(responseCode = "404", description = "Such a user does not exist"),
        ]
    )
    @PostMapping("/item/{idUser}")
    fun saveNewItem(@PathVariable idUser: Long, @RequestBody item: Item) {
        return service.saveItem(idUser, item)
    }

}
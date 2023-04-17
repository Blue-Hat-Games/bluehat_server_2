package com.example.bluehat_server2.domain.user.controller

import com.example.bluehat_server2.domain.user.service.UserCoinService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user/coin")
class UserCoinController(private val userCoinService: UserCoinService) {

    @GetMapping
    fun getUserCoin(): String {
        return userCoinService.getUserCoin()
    }

    @PatchMapping
    fun updateUserCoin(): String {
        return userCoinService.updateUserCoin()
    }

}

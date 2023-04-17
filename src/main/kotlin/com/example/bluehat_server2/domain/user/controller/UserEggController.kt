package com.example.bluehat_server2.domain.user.controller

import com.example.bluehat_server2.domain.user.service.UserEggService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user/egg")
class UserEggController(private val userEggService : UserEggService){

    @GetMapping
    fun getUserEgg() : String {
        return userEggService.getUserEgg();
    }

    @PatchMapping
    fun updateUserEgg() : String {
        return userEggService.updateUserEgg();
    }
}
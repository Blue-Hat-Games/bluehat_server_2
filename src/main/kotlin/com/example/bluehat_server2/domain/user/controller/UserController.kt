package com.example.bluehat_server2.domain.user.controller

import com.example.bluehat_server2.domain.user.model.dto.response.UserInfoResponseDto
import com.example.bluehat_server2.domain.user.service.UserService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/user")
class UserController(private val userService: UserService) {

    @GetMapping
    fun getUserInfo(): List<UserInfoResponseDto> {
        return userService.getUserInfo()
    }

    @PostMapping("/join")
    fun joinUser(): String {
        return userService.joinUser()
    }

    @DeleteMapping
    fun deleteUser(): String {
        return userService.deleteUser()
    }

    @PatchMapping("")
    fun updateUserInfo(): String {
        return userService.updateUserInfo()
    }


}
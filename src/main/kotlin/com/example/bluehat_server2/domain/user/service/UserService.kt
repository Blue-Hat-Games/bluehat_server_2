package com.example.bluehat_server2.domain.user.service

import com.example.bluehat_server2.domain.user.model.dto.response.UserInfoResponseDto
import org.springframework.stereotype.Service

@Service
class UserService {
    fun getUserInfo(): List<UserInfoResponseDto> {
        val result = UserInfoResponseDto("name", 1, 3, "wallet_addr", "email")
        return listOf(result)
    }

    fun joinUser() : String {
        return "UserJoin"
    }

    fun deleteUser() : String {
        return "UserDelete"
    }

    fun updateUserInfo() : String {
        return "updateUserInfo"
    }

}
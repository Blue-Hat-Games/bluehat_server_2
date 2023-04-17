package com.example.bluehat_server2.domain.user.service

import com.example.bluehat_server2.domain.user.model.dto.response.UserInfoResponseDto
import org.springframework.stereotype.Service

@Service
class UserService {
    fun getUserInfo(): List<UserInfoResponseDto> {
        val result = UserInfoResponseDto("name", 1, 3, "wallet_addr", "email")
        return listOf(result)
    }

}
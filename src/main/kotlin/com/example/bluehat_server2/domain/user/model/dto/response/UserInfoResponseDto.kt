package com.example.bluehat_server2.domain.user.model.dto.response

data class UserInfoResponseDto(
    var username: String,
    var coin: Int,
    var egg: Int,
    var walletAddress: String,
    var email: String,
)

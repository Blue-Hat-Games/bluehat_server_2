package com.example.bluehat_server2.domain.user.service

import org.springframework.stereotype.Service

@Service
class UserCoinService {
    fun getUserCoin() : String {
        return "user Coin"
    }
    fun updateUserCoin() : String {
        return "update User coin"
    }

}
package com.example.bluehat_server2.domain.user.service

import org.springframework.stereotype.Service

@Service
class UserEggService {

    fun getUserEgg(): String {
        return "user Egg"
    }

    fun updateUserEgg(): String {
        return "update User Egg"
    }
}
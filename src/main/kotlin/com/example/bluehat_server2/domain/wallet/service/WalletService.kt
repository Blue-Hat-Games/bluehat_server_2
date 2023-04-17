package com.example.bluehat_server2.domain.wallet.service

import org.springframework.stereotype.Service

@Service
class WalletService {

    fun getWallet(): String {
        return "get Wallet"
    }

    fun createWallet(): String {
        return "create Wallet"
    }

}
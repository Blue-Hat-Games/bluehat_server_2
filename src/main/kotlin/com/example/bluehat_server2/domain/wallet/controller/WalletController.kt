package com.example.bluehat_server2.domain.wallet.controller


import com.example.bluehat_server2.domain.wallet.service.WalletService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/wallet")
class WalletController(private val walletService: WalletService) {

    @GetMapping
    fun getWallet(): String {
        return walletService.getWallet()
    }

    @PostMapping
    fun createWallet(): String {
        return walletService.createWallet()
    }

}
package com.example.bluehat_server2.domain.nft.controller

import com.example.bluehat_server2.domain.nft.service.NftService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/nft")
class NftController(private val nftService: NftService) {

    @PostMapping
    fun createNft(): String {
        return nftService.createNft()
    }

}

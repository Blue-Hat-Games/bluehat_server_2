package com.example.bluehat_server2.domain.market.controller

import com.example.bluehat_server2.domain.market.service.MarketService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/market")
class MarketController(private val marketService: MarketService) {

    @GetMapping
    fun getAllMarketItems(): String {
        return marketService.getAllMarketItems()
    }

    @GetMapping("/{itemId}")
    fun getItemDetail(@PathVariable itemId: String): String {
        return marketService.getItemDetail()
    }

    @PostMapping
    fun sellItemToMarket(): String {
        return marketService.sellItemToMarket()
    }

    @PostMapping("/{itemId}/buy")
    fun buyItemFromMarket(): String {
        return marketService.buyItemFromMarket()
    }


}

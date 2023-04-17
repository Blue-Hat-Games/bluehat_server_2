package com.example.bluehat_server2.domain.market.service

import org.springframework.stereotype.Service

@Service
class MarketService {

    fun getAllMarketItems(): String {
        return "get All Market Items"
    }

    fun getItemDetail(): String {
        return "get Market Item detail"
    }

    fun sellItemToMarket(): String {
        return "sell Item to Market"
    }

    fun buyItemFromMarket(): String {
        return "buy from market"
    }

}
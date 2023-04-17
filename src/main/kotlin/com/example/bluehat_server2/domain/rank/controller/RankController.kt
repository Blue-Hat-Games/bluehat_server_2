package com.example.bluehat_server2.domain.rank.controller

import com.example.bluehat_server2.domain.rank.service.RankService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/rank")
class RankController(private val rankService: RankService) {

    @GetMapping
    fun getRank(): String {
        return rankService.getRank()
    }

}

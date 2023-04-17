package com.example.bluehat_server2.domain.quest.controller

import com.example.bluehat_server2.domain.quest.service.QuestService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/quests")
class QuestController(private val questService: QuestService) {

    @GetMapping
    fun getUserQuest(): String {
        return questService.getUserQuests()
    }

    @PostMapping("/{questId}/complete")
    fun completeQuest(@PathVariable questId: String): String {
        return questService.completeQuest()
    }

    @PostMapping("/{questId}/reward")
    fun getRewardQuest(@PathVariable questId: String): String {
        return questService.getRewardQuest()
    }

}

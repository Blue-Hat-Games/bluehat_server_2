package com.example.bluehat_server2.domain.quest.service

import org.springframework.stereotype.Service

@Service
class QuestService {
    fun getUserQuests(): String {
        return "user All Quests"
    }

    fun completeQuest(): String {
        return "complete quest"
    }

    fun getRewardQuest(): String {
        return "get Reward to Quest"
    }
}

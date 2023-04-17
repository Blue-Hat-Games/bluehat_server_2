package com.example.bluehat_server2.domain.animal.service

import org.springframework.stereotype.Service

@Service
class AnimalService {
    fun getAllUserAnimals(): String {
        return "All user animals"
    }

    fun createNewAnimal(): String {
        return "New animal created"
    }

    fun getAnimalInfo(): String {
        return "Animal info for "
    }

    fun merge(): String {
        return "Animals merged"
    }

    fun updateAnimal(): String {
        return "Animal updated"
    }

    fun changeAnimalColor(): String {
        return "Animal color changed"
    }

    fun createNewHatToAnimal(): String {
        return "New hat created for animal"
    }

}
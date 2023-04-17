package com.example.bluehat_server2.domain.animal.controller

import com.example.bluehat_server2.domain.animal.service.AnimalService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/animal")
class AnimalController(private val animalService: AnimalService) {

    @GetMapping
    fun getAllUserAnimals(): String {
        return animalService.getAllUserAnimals()
    }

    @PostMapping
    fun createNewAnimal(): String {
        return animalService.createNewAnimal()
    }

    @GetMapping("{animalId}")
    fun getAnimalInfo(@PathVariable animalId: String): String {
        return animalService.getAnimalInfo()
    }

    @PostMapping("/merge")
    fun mergeAnimal(): String {
        return animalService.merge()
    }

    @PatchMapping("{animalId}")
    fun updateAnimal(@PathVariable animalId: String): String {
        return animalService.updateAnimal()
    }

    @PatchMapping("{animalId}/color")
    fun changeAnimalColor(@PathVariable animalId: String): String {
        return animalService.changeAnimalColor()
    }


    @PostMapping("{animalId}/hat")
    fun createNewHatToAnimal(@PathVariable animalId: String): String {
        return animalService.createNewHatToAnimal()
    }

}
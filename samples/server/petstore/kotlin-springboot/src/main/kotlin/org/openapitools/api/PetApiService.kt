package org.openapitools.api

import org.openapitools.model.ModelApiResponse
import org.openapitools.model.Pet

interface PetApiService {

    fun addPet(pet: Pet): Unit

    fun deletePet(petId: Long,apiKey: String?): Unit

    fun findPetsByStatus(status: List<String>): List<Pet>

    fun findPetsByTags(tags: List<String>): List<Pet>

    fun getPetById(petId: Long): Pet

    fun updatePet(pet: Pet): Unit

    fun updatePetWithForm(petId: Long,name: String?,status: String?): Unit

    fun uploadFile(petId: Long,additionalMetadata: String?,file: org.springframework.web.multipart.MultipartFile): ModelApiResponse
}

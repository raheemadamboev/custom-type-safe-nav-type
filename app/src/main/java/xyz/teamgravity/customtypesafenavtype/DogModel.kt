package xyz.teamgravity.customtypesafenavtype

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DogModel(
    @SerialName("id") val id: Int,
    @SerialName("name") val name: String
)
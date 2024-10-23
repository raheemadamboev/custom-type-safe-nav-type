package xyz.teamgravity.customtypesafenavtype

import kotlinx.serialization.Serializable

sealed interface Route {

    @Serializable
    data object DogList : Route

    @Serializable
    data class Dog(
        val dog: DogModel,
        val size: DogSize
    ) : Route
}
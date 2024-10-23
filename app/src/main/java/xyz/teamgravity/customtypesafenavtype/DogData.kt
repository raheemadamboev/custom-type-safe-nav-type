package xyz.teamgravity.customtypesafenavtype

import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.persistentListOf

object DogData {
    val VALUE: ImmutableList<Pair<DogModel, DogSize>> = persistentListOf(
        DogModel(1, "Golden Retriever") to DogSize.Large,
        DogModel(2, "Labrador Retriever") to DogSize.Large,
        DogModel(3, "German Shepherd") to DogSize.Large,
        DogModel(4, "Poodle") to DogSize.Medium,
        DogModel(5, "Bulldog") to DogSize.Medium,
        DogModel(6, "Rottweiler") to DogSize.Large,
        DogModel(7, "Beagle") to DogSize.Small,
        DogModel(8, "Dachshund") to DogSize.Small,
        DogModel(9, "Boxer") to DogSize.Large,
        DogModel(10, "Yorkshire Terrier") to DogSize.Small,
        DogModel(11, "Siberian Husky") to DogSize.Large,
        DogModel(12, "Australian Shepherd") to DogSize.Medium,
        DogModel(13, "Doberman Pinscher") to DogSize.Large,
        DogModel(14, "Bernese Mountain DogModel") to DogSize.Large,
        DogModel(15, "French Bulldog") to DogSize.Small,
        DogModel(16, "Golden Doodle") to DogSize.Medium,
        DogModel(17, "Pomeranian") to DogSize.Small,
        DogModel(18, "Shih Tzu") to DogSize.Small,
        DogModel(19, "Great Dane") to DogSize.Large,
        DogModel(20, "Border Collie") to DogSize.Medium,
    )
}
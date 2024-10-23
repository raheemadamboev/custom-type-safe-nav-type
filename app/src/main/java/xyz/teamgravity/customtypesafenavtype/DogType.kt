package xyz.teamgravity.customtypesafenavtype

import android.net.Uri
import android.os.Bundle
import androidx.navigation.NavType
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

object DogType : NavType<DogModel>(
    isNullableAllowed = false
) {

    override fun put(bundle: Bundle, key: String, value: DogModel) {
        bundle.putString(key, Json.encodeToString(value))
    }

    override fun get(bundle: Bundle, key: String): DogModel? {
        return Json.decodeFromString(bundle.getString(key) ?: return null)
    }

    override fun serializeAsValue(value: DogModel): String {
        return Uri.encode(Json.encodeToString(value))
    }

    override fun parseValue(value: String): DogModel {
        return Json.decodeFromString(Uri.decode(value))
    }
}
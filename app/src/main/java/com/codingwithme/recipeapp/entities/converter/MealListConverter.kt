package com.codingwithme.recipeapp.entities.converter

import androidx.room.TypeConverter
import com.codingwithme.recipeapp.entities.MealsItems
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

// Konverterklasse, um Listen von MealsItems-Objekten in JSON-Strings und umgekehrt zu konvertieren.
class MealListConverter {

    // Konvertiert eine Liste von MealsItems in einen JSON-String.
    @TypeConverter
    fun fromCategoryList(category: List<MealsItems>): String? {
        if (category == null) {
            return null
        } else {
            val gson = Gson()
            val type = object : TypeToken<List<MealsItems>>() {}.type
            return gson.toJson(category, type)
        }
    }

    // Konvertiert einen JSON-String in eine Liste von MealsItems-Objekten.
    @TypeConverter
    fun toCategoryList(categoryString: String): List<MealsItems>? {
        if (categoryString == null) {
            return null
        } else {
            val gson = Gson()
            val type = object : TypeToken<List<MealsItems>>() {}.type
            return gson.fromJson(categoryString, type)
        }
    }
}

package com.codingwithme.recipeapp.entities.converter

import androidx.room.TypeConverter
import androidx.room.TypeConverters
import com.codingwithme.recipeapp.entities.Category
import com.codingwithme.recipeapp.entities.CategoryItems
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

// Konverterklasse, um Listen von CategoryItems-Objekten in JSON-Strings und umgekehrt zu konvertieren.
class CategoryListConverter {

    // Konvertiert eine Liste von CategoryItems in einen JSON-String.
    @TypeConverter
    fun fromCategoryList(category: List<CategoryItems>): String? {
        if (category == null) {
            return null
        } else {
            val gson = Gson()
            val type = object : TypeToken<CategoryItems>() {}.type
            return gson.toJson(category, type)
        }
    }

    // Konvertiert einen JSON-String in eine Liste von CategoryItems-Objekten.
    @TypeConverter
    fun toCategoryList(categoryString: String): List<CategoryItems>? {
        if (categoryString == null) {
            return null
        } else {
            val gson = Gson()
            val type = object : TypeToken<CategoryItems>() {}.type
            return gson.fromJson(categoryString, type)
        }
    }
}

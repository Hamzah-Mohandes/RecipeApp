package com.codingwithme.recipeapp.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

// Entitätsklasse für die einzelnen Mahlzeiten-Elemente (MealsItems) in der Datenbank.
@Entity(tableName = "MealItems")
data class MealsItems(

    // Primärschlüssel für die Mahlzeit. Die automatische Generierung ist aktiviert.
    @PrimaryKey(autoGenerate = true)
    var id: Int,

    // Spalte für die ID der Mahlzeit.
    @ColumnInfo(name = "idMeal")
    @Expose
    @SerializedName("idMeal")
    val idMeal: String,

    // Spalte für den Namen der Kategorie der Mahlzeit.
    @ColumnInfo(name = "categoryName")
    val categoryName: String,

    // Spalte für den Namen der Mahlzeit.
    @ColumnInfo(name = "strmeal")
    @Expose
    @SerializedName("strMeal")
    val strMeal: String,

    // Spalte für den Bild-URL-Link der Mahlzeit.
    @ColumnInfo(name = "strmealthumb")
    @Expose
    @SerializedName("strMealThumb")
    val strMealThumb: String
)

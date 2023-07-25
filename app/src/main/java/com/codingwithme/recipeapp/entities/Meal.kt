package com.codingwithme.recipeapp.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.codingwithme.recipeapp.entities.converter.MealListConverter
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

// Entitätsklasse für die Mahlzeitentabelle (Meal) in der Datenbank.
@Entity(tableName = "Meal")
class Meal(

    // Primärschlüssel für die Mahlzeit. Die automatische Generierung ist aktiviert.
    @PrimaryKey(autoGenerate = true)
    var id: Int,

    // Spalte für die Liste von Mahlzeiten-Elementen (MealsItems) in der Mahlzeit.
    @ColumnInfo(name = "meals")
    @Expose
    @SerializedName("meals")
    @TypeConverters(MealListConverter::class)
    var mealsItem: List<MealsItems>? = null

)

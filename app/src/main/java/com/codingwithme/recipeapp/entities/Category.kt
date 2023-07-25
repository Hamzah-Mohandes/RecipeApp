package com.codingwithme.recipeapp.entities

import androidx.room.*
import com.codingwithme.recipeapp.entities.converter.CategoryListConverter
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

// Entitätsklasse für die Kategorie-Tabelle in der Datenbank.
@Entity(tableName = "Category")
data class Category(

    // Primärschlüssel für die Kategorie. Die automatische Generierung ist aktiviert.
    @PrimaryKey(autoGenerate = true)
    var id: Int,

    // Spalte für die Liste von Kategorieelementen (CategoryItems) in der Kategorie.
    @ColumnInfo(name = "categoryItems")
    @Expose
    @SerializedName("categories")
    @TypeConverters(CategoryListConverter::class)
    var categoryItems: List<CategoryItems>? = null
)

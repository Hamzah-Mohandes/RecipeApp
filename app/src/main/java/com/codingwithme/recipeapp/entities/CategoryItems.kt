package com.codingwithme.recipeapp.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

// Entitätsklasse für die Kategorie-Elemente (CategoryItems) in der Datenbank.
@Entity(tableName = "CategoryItems")
data class CategoryItems(

    // Primärschlüssel für das Kategorie-Element. Die automatische Generierung ist aktiviert.
    @PrimaryKey(autoGenerate = true)
    var id: Int,

    // Spalte für die Kategorie-ID des Elements.
    @ColumnInfo(name = "idcategory")
    @Expose
    @SerializedName("idCategory")
    val idcategory: String,

    // Spalte für den Namen der Kategorie des Elements.
    @ColumnInfo(name = "strcategory")
    @Expose
    @SerializedName("strCategory")
    val strcategory: String,

    // Spalte für den Bild-URL-Link der Kategorie des Elements.
    @ColumnInfo(name = "strcategorythumb")
    @Expose
    @SerializedName("strCategoryThumb")
    val strcategorythumb: String,

    // Spalte für die Beschreibung der Kategorie des Elements.
    @ColumnInfo(name = "strcategorydescription")
    @Expose
    @SerializedName("strCategoryDescription")
    val strcategorydescription: String
)

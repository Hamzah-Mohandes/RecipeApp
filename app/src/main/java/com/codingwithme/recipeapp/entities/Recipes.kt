package com.codingwithme.recipeapp.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

// Entitätsklasse für die Rezept-Tabelle (Recipes) in der Datenbank.
@Entity(tableName = "Recipes")
data class Recipes(

        // Primärschlüssel für das Rezept. Die automatische Generierung ist aktiviert.
        @PrimaryKey(autoGenerate = true)
        var id: Int,

        // Spalte für den Namen des Gerichts/Rezepts.
        @ColumnInfo(name = "dishName")
        var dishName: String
) : Serializable

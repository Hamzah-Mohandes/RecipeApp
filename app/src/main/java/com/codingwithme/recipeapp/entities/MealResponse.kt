package com.codingwithme.recipeapp.entities

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

// Datenklasse für die gesamte Antwort von Mahlzeiten aus der API.
data class MealResponse(
    // Liste von Mahlzeiten-Elementen in der API-Antwort.
    @Expose
    @SerializedName("meals")
    var mealsEntity: List<MealsEntity>
)

// Datenklasse für einzelne Mahlzeiten-Elemente in der API-Antwort.
data class MealsEntity(
    // ID der Mahlzeit.
    @Expose
    @SerializedName("idMeal")
    val idmeal: String,

    // Name der Mahlzeit.
    @Expose
    @SerializedName("strMeal")
    val strmeal: String,

    // Kategorie der Mahlzeit.
    @Expose
    @SerializedName("strCategory")
    val strcategory: String,

    // Herkunftsgebiet der Mahlzeit.
    @Expose
    @SerializedName("strArea")
    val strarea: String,

    // Anweisungen zur Zubereitung der Mahlzeit.
    @Expose
    @SerializedName("strInstructions")
    val strinstructions: String,

    // URL-Link zum Bild der Mahlzeit.
    @Expose
    @SerializedName("strMealThumb")
    val strmealthumb: String,

    // Tags oder Schlagwörter für die Mahlzeit.
    @Expose
    @SerializedName("strTags")
    val strtags: String,

    // URL-Link zum YouTube-Video der Mahlzeitenzubereitung.
    @Expose
    @SerializedName("strYoutube")
    val stryoutube: String,

    // Zutaten und ihre Mengenangaben (20 Zutaten möglich).
    // Beispiel: strIngredient1, strIngredient2, ..., strIngredient20
    @Expose
    @SerializedName("strIngredient1")
    val stringredient1: String,
    // ...
    @Expose
    @SerializedName("strIngredient20")
    val stringredient20: String,

    // Mengenangaben für die Zutaten (20 Mengenangaben möglich).
    // Beispiel: strMeasure1, strMeasure2, ..., strMeasure20
    @Expose
    @SerializedName("strMeasure1")
    val strmeasure1: String,
    // ...
    @Expose
    @SerializedName("strMeasure20")
    val strmeasure20: String,

    // URL-Link zur Quelle oder zum Ursprung der Mahlzeit.
    @Expose
    @SerializedName("strSource")
    val strsource: String
)

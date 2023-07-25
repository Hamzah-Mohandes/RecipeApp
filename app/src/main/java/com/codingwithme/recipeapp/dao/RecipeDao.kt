package com.codingwithme.recipeapp.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.codingwithme.recipeapp.entities.CategoryItems
import com.codingwithme.recipeapp.entities.MealsItems

@Dao
interface RecipeDao {

    // Gibt eine Liste aller Kategorien aus der Datenbank zurück, sortiert nach ID absteigend.
    @Query("SELECT * FROM categoryitems ORDER BY id DESC")
    suspend fun getAllCategory(): List<CategoryItems>

    // Fügt eine Kategorie in die Datenbank ein. Bei Konflikt wird die vorhandene Kategorie ersetzt.
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCategory(categoryItems: CategoryItems?)

    // Fügt ein Mahlzeitenelement in die Datenbank ein. Bei Konflikt wird das vorhandene Element ersetzt.
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMeal(mealsItems: MealsItems?)

    // Löscht alle Kategorien aus der Datenbank.
    @Query("DELETE FROM categoryitems")
    suspend fun clearDb()

    // Gibt eine Liste aller Mahlzeiten für eine bestimmte Kategorie aus der Datenbank zurück, sortiert nach ID absteigend.
    @Query("SELECT * FROM MealItems WHERE categoryName = :categoryName ORDER BY id DESC")
    suspend fun getSpecificMealList(categoryName: String): List<MealsItems>
}

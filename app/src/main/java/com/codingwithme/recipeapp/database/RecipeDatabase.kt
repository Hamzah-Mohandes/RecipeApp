package com.codingwithme.recipeapp.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.codingwithme.recipeapp.dao.RecipeDao
import com.codingwithme.recipeapp.entities.*
import com.codingwithme.recipeapp.entities.converter.CategoryListConverter
import com.codingwithme.recipeapp.entities.converter.MealListConverter

// Definition der Room-Datenbank mit den Entitätsklassen und der Datenbankversion.
@Database(entities = [Recipes::class, CategoryItems::class, Category::class, Meal::class, MealsItems::class], version = 1, exportSchema = false)
@TypeConverters(CategoryListConverter::class, MealListConverter::class)
abstract class RecipeDatabase : RoomDatabase() {

    companion object {
        // Singleton-Instanz der Datenbank, um sicherzustellen, dass nur eine Instanz erstellt wird.
        private var recipesDatabase: RecipeDatabase? = null

        // Methode zum Abrufen der Datenbankinstanz mit dem App-Kontext.
        @Synchronized
        fun getDatabase(context: Context): RecipeDatabase {
            if (recipesDatabase == null) {
                // Erstelle die Datenbankinstanz, wenn sie noch nicht existiert.
                recipesDatabase = Room.databaseBuilder(
                    context.applicationContext,
                    RecipeDatabase::class.java,
                    "recipe.db"
                ).build()
            }
            return recipesDatabase!!
        }
    }

    // Abstrakte Methode, um das Data Access Object (DAO) für die Datenbank zurückzugeben.
    abstract fun recipeDao(): RecipeDao
}

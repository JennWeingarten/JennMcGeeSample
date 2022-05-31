package com.example.mcgeesample.feature_item.data.datasource.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.mcgeesample.feature_item.models.Item


@Database(
    entities = [Item::class],
    version = 1
)
abstract class NoteDatabase : RoomDatabase() {

    abstract val noteDao: ItemDao

    companion object {
        const val DATABASE_NAME = "items_db"
    }
}
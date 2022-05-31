package com.example.mcgeesample.feature_item.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Item(
    val name: String,
    val description: String,
    val color: Int?,
    @PrimaryKey val id: Int? = null,
) {
    companion object {
        //TODO fix colors here
        val itemColors = listOf(1, 2, 3, 4, 5)
    }
}
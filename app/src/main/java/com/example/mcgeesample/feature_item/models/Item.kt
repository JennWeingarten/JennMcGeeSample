package com.example.mcgeesample.feature_item.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Item(
    val name: String,
    val description: String,
    @PrimaryKey val id: Int? = null
)
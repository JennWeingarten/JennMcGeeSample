package com.example.mcgeesample.feature_item.domain.repository

import com.example.mcgeesample.feature_item.models.Item
import kotlinx.coroutines.flow.Flow

interface ItemRepo {

    fun getItems(): Flow<List<Item>>

    suspend fun getItemById(id: Int): Item?

    suspend fun insertItem(note: Item)

    suspend fun deleteItem(note: Item)
}
package com.example.mcgeesample.feature_item.data.datasource.repositories

import com.example.mcgeesample.feature_item.data.datasource.local.ItemDao
import com.example.mcgeesample.feature_item.domain.repository.ItemRepo
import com.example.mcgeesample.feature_item.models.Item
import kotlinx.coroutines.flow.Flow

class ItemRepoImpl(
    private val dao: ItemDao
) : ItemRepo {

    override fun getItems(): Flow<List<Item>> {
        return dao.getItems()
    }

    override suspend fun getItemById(id: Int): Item? {
        return dao.getItemById(id)
    }

    override suspend fun insertItem(note: Item) {
        dao.insertItem(note)
    }

    override suspend fun deleteItem(note: Item) {
        dao.deleteItem(note)
    }
}
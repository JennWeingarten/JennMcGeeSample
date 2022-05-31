package com.example.mcgeesample.feature_item.domain.usecases.getItems

import com.example.mcgeesample.feature_item.domain.repository.ItemRepo
import com.example.mcgeesample.feature_item.domain.util.ItemOrder
import com.example.mcgeesample.feature_item.domain.util.OrderType
import com.example.mcgeesample.feature_item.models.Item
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class GetItemsUseCase(
    private val repository: ItemRepo
) {

    operator fun invoke(
        itemOrder: ItemOrder = ItemOrder.Name(OrderType.Descending)
    ): Flow<List<Item>> {
        return repository.getItems().map { notes ->
            when (itemOrder.orderType) {
                is OrderType.Ascending -> {
                    when (itemOrder) {
                        is ItemOrder.Name -> notes.sortedBy { it.name.lowercase() }
                        is ItemOrder.Color -> notes.sortedBy { it.color }
                    }
                }
                is OrderType.Descending -> {
                    when (itemOrder) {
                        is ItemOrder.Name -> notes.sortedByDescending { it.name.lowercase() }
                        is ItemOrder.Color -> notes.sortedByDescending { it.color }
                    }
                }
            }
        }
    }
}
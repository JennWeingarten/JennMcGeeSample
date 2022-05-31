package com.example.mcgeesample.feature_item.domain.util

sealed class ItemOrder(val orderType: OrderType) {
    class Name(orderType: OrderType) : ItemOrder(orderType)
    class Color(orderType: OrderType) : ItemOrder(orderType)

    fun copy(orderType: OrderType): ItemOrder {
        return when (this) {
            is Name -> Name(orderType)
            is Color -> Color(orderType)
        }
    }
}
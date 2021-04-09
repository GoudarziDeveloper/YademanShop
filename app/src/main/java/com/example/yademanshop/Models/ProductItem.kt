package com.example.yademanshop.Models

data class ProductItem(
    val _links: Links,
    val attributes: List<Attribute>,
    val average_rating: String,
    val catalog_visibility: String,
    val categories: List<Category>,
    val description: String,
    val grouped_products: List<Any>,
    val id: Int,
    val images: List<Image>,
    val name: String,
    val parent_id: Int,
    val permalink: String,
    val price: String,
    val purchase_note: String,
    val rating_count: Int,
    val regular_price: String,
    val sale_price: String,
    val short_description: String,
    val status: String,
    val tags: List<Any>,
    val type: String
)
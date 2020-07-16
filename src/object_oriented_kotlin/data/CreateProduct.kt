package object_oriented_kotlin.data

import object_oriented_kotlin.annotations.NotBlank

data class CreateProduct(
    @NotBlank val id: String,
    @NotBlank val name: String,
    @NotBlank val price: Int)

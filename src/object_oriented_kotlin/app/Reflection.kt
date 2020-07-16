package object_oriented_kotlin.app

import object_oriented_kotlin.annotations.NotBlank
import object_oriented_kotlin.data.CreateProduct
import object_oriented_kotlin.exception.ValidationException
import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.memberProperties

fun validate(create: Any) {
//    return when {
//        createProduct.id == "" -> {
//            throw ValidationException("Id is blank")
//        }
//        createProduct.name == "" -> {
//            throw ValidationException("Name is blank")
//        }
//        createProduct.price == 0 -> {
//            throw  ValidationException("Price is 0")
//        }
//        else -> {
//            println(createProduct.toString())
//        }
//    }

    val clazz = create::class
    val properties = clazz.memberProperties

    for (property in properties) {
        if (property.findAnnotation<NotBlank>() != null) {
            val value = property.call(create)
            when(value) {
                is String -> {
                    if ("" == value) {
                        throw ValidationException(
                            "${property.name} is Blank")
                    }
                }
            }
        }
    }
}

fun main() {
    val create = CreateProduct("", "Cream", 10)
    println(create)
}
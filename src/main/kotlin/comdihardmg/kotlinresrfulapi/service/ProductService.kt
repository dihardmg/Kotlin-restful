package comdihardmg.kotlinresrfulapi.service

import comdihardmg.kotlinresrfulapi.model.CreateProductRequest
import comdihardmg.kotlinresrfulapi.model.ProductResponse
import comdihardmg.kotlinresrfulapi.model.UpdateProductRequest

interface ProductService {

    fun create(productRequest: CreateProductRequest): ProductResponse

    fun get(id: String): ProductResponse

    fun update(id: String, updateProductRequest: UpdateProductRequest): ProductResponse
}
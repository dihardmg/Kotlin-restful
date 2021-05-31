package comdihardmg.kotlinresrfulapi.service

import comdihardmg.kotlinresrfulapi.model.CreateProductRequest
import comdihardmg.kotlinresrfulapi.model.ProductResponse

interface ProductService {

    fun create(productRequest: CreateProductRequest): ProductResponse
}
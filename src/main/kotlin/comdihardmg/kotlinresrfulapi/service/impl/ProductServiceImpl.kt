package comdihardmg.kotlinresrfulapi.service.impl

import comdihardmg.kotlinresrfulapi.entity.Product
import comdihardmg.kotlinresrfulapi.model.CreateProductRequest
import comdihardmg.kotlinresrfulapi.model.ProductResponse
import comdihardmg.kotlinresrfulapi.repository.ProductRepository
import comdihardmg.kotlinresrfulapi.service.ProductService
import org.springframework.stereotype.Service
import java.util.*

@Service
class ProductServiceImpl(val productRepository: ProductRepository) : ProductService {

    override fun create(createProductRequest: CreateProductRequest): ProductResponse {
        val product = Product(
            id = createProductRequest.id,
            name = createProductRequest.name,
            price = createProductRequest.price,
            quantity = createProductRequest.quantity,
            createdAt = Date(),
            updatedAt = null
        )

        productRepository.save(product)

        return ProductResponse(
            id = product.id,
            name = product.name,
            price = product.price,
            quantity = product.quantity,
            createdAt = product.createdAt,
            updatedAt = product.updatedAt
        )
    }
}
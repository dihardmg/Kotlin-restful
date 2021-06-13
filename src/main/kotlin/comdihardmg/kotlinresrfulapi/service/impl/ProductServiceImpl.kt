package comdihardmg.kotlinresrfulapi.service.impl

import comdihardmg.kotlinresrfulapi.entity.Product
import comdihardmg.kotlinresrfulapi.error.NotFoundException
import comdihardmg.kotlinresrfulapi.model.CreateProductRequest
import comdihardmg.kotlinresrfulapi.model.ProductResponse
import comdihardmg.kotlinresrfulapi.model.UpdateProductRequest
import comdihardmg.kotlinresrfulapi.repository.ProductRepository
import comdihardmg.kotlinresrfulapi.service.ProductService
import comdihardmg.kotlinresrfulapi.validation.ValidationUtil
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import java.util.*

@Service
class ProductServiceImpl(
    val productRepository: ProductRepository,
    val validationUtil: ValidationUtil
    ) : ProductService {

    override fun create(createProductRequest: CreateProductRequest): ProductResponse {
        validationUtil.validate(createProductRequest)

        val product = Product(
            id = createProductRequest.id!!,
            name = createProductRequest.name!!,
            price = createProductRequest.price!!,
            quantity = createProductRequest.quantity!!,
            createdAt = Date(),
            updatedAt = null
        )

        productRepository.save(product)
        return convertProductToProductResponse(product)
    }

    override fun get(id: String): ProductResponse {
        val product = productRepository.findByIdOrNull(id)
        if (product == null){
            throw NotFoundException()

        }else
            return convertProductToProductResponse(product)
    }

    override fun update(id: String, updateProductRequest: UpdateProductRequest): ProductResponse {
        val product = productRepository.findByIdOrNull(id)
        if (product == null){
            throw NotFoundException()
        }
        product.apply {
            name = updateProductRequest.name!!
            price = updateProductRequest.price!!
            quantity = updateProductRequest.quantity!!
            updatedAt = Date()
        }
        productRepository.save(product)
        return convertProductToProductResponse(product)
    }

    private  fun convertProductToProductResponse(product:Product):ProductResponse{
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
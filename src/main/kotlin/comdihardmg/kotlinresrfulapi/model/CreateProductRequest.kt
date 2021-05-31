package comdihardmg.kotlinresrfulapi.model

data class CreateProductRequest (
    val id: String,
    val name: String,
    val price: Long,
    val quantity: Int
        )
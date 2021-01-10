package kg.nurik.dagger2.data.model

data class BaseListingResponse<T>(
    val total_count: Int,
    val rows: List<T>
)

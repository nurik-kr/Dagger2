package kg.nurik.dagger2.data

import kg.nurik.dagger2.data.model.BaseListingResponse
import kg.nurik.dagger2.data.model.BlogModel
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitApi {

    @GET("api/v1/articles")
    suspend fun loadBlogs(
        @Query("limit") limit: Int,
        @Query("page") page: Int,
        @Query("order") order: String
    ): BaseListingResponse<BlogModel>
}
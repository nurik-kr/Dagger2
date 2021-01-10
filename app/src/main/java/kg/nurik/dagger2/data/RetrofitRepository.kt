package kg.nurik.dagger2.data

import kg.nurik.dagger2.data.model.BaseListingResponse
import kg.nurik.dagger2.data.model.BlogModel

interface RetrofitRepository {
    suspend fun loadBLogs(limit: Int, page: Int): BaseListingResponse<BlogModel>
}

class RetrofitRepositoryImpl(private val network: RetrofitInteractor) : RetrofitRepository {
    override suspend fun loadBLogs(limit: Int, page: Int): BaseListingResponse<BlogModel> {
        return network.loadBLogs(limit, page)
    }
}
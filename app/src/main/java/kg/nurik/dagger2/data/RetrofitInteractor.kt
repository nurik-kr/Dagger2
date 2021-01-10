package kg.nurik.dagger2.data

import kg.nurik.dagger2.data.model.BaseListingResponse
import kg.nurik.dagger2.data.model.BlogModel

interface RetrofitInteractor {
   suspend fun loadBLogs(limit: Int, page: Int): BaseListingResponse<BlogModel>
}

class RetrofitInteractorImpl(private val service: RetrofitApi) : RetrofitInteractor {

    override suspend fun loadBLogs(limit: Int, page: Int): BaseListingResponse<BlogModel> {
        return service.loadBlogs(limit = limit, page = page, order = "{\"created_at\":\"asc\"}")
    }
}
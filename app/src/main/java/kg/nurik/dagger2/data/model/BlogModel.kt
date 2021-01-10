package kg.nurik.dagger2.data.model

import com.google.gson.annotations.SerializedName

data class BlogModel(
    val id: Int?,
    val title: String?,
    val content: String?,
    val status_code: String?,
    val created_at: String?,
    val updated_at: String?,
    val preview: String?,
    @SerializedName("comments_count")
    val commentsCount: Int
)
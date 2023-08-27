package com.henriette.fetchingposts.repository


import com.henriette.fetchingposts.api.ApiClient
import com.henriette.fetchingposts.api.ApiInterface
import com.henriette.fetchingposts.model.PostsData
import com.henriette.fetchingposts.model.PostsResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response

class PostsRepository {
    val apiClient = ApiClient.buildApiClient(ApiInterface::class.java)
    suspend fun getPosts(): Response<List<PostsData>> {
            return withContext(Dispatchers.IO) {
                apiClient.getPosts()

            }

    }
}
package com.henriette.fetchingposts.repository

import androidx.lifecycle.LiveData
import com.henriette.fetchingposts.database.PostsDb
import com.henriette.fetchingposts.PostsApp
import com.henriette.fetchingposts.api.ApiClient
import com.henriette.fetchingposts.api.ApiInterface
import com.henriette.fetchingposts.model.PostsData
import com.henriette.fetchingposts.model.PostsResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.Response

class PostsRepository {
    val apiClient= ApiClient.buildApiClient(ApiInterface::class.java)

    suspend fun getPost(): Response<PostsResponse>{
        return withContext(Dispatchers.IO){
        apiClient.getPosts()
        }
    }

}
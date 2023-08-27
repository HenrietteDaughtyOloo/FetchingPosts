package com.henriette.fetchingposts.api

import com.henriette.fetchingposts.model.PostsData
import com.henriette.fetchingposts.model.PostsResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiInterface {

    @GET("/posts")
    suspend fun getPosts(): Response<List<PostsData>>
}
package com.henriette.fetchingposts.api

import com.henriette.fetchingposts.model.PostsData
import com.henriette.fetchingposts.model.PostsResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiInterface {

    @GET("/post")
    suspend fun getPosts(): Response<PostsResponse>

    @GET("/post/{id}")
    suspend fun getPostById(@Path("id")Id:Int): Response<PostsData>


}
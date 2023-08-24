package com.henriette.fetchingposts.api

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiInterface {

    @GET("/ppst")
    suspend fun getProducts(postsRequest): Response<PostResponse>

    @GET("/post/{id}")
    suspend fun getPostById(@Path("id")Id:Int): Response<Posts>


}
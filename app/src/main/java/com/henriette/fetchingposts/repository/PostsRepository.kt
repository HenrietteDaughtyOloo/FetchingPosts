package com.henriette.fetchingposts.repository

import androidx.lifecycle.LiveData
import com.henriette.fetchingposts.database.PostsDb
import com.henriette.fetchingposts.PostsApp
import com.henriette.fetchingposts.model.PostsData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class PostsRepository {

    val database= PostsDb.getDatabase(PostsApp.appContext)

    suspend fun getPost(contacts:PostsData){
        withContext(Dispatchers.IO){
            database.getPostsDao().getAllPosts()
        }
    }
    fun getAllPosts(): LiveData<List<PostsData>> {
        return  database.getPostsDao().getAllPosts()
    }
}
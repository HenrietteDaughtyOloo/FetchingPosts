package com.henriette.fetchingposts.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.henriette.fetchingposts.model.PostsData
import com.henriette.fetchingposts.repository.PostsRepository
import kotlinx.coroutines.launch

class PostsViewModel {
    val postsRepository=PostsRepository()


    fun getPosts(): LiveData<List<PostsData>> {
        return postsRepository.getAllPosts()
    }
}
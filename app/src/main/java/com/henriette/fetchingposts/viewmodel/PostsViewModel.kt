package com.henriette.fetchingposts.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.henriette.fetchingposts.model.PostsData
import com.henriette.fetchingposts.repository.PostsRepository
import kotlinx.coroutines.launch

class PostsViewModel : ViewModel() {
    val postsRepository = PostsRepository()
    val postsLiveData = MutableLiveData<List<PostsData>>()
    var errorLiveData = MutableLiveData<String>()
    fun getAllPosts() {
        viewModelScope.launch {
            val response = postsRepository.getPosts()
            if (response.isSuccessful) {
                val postsData = response.body() ?: emptyList()
                postsLiveData.postValue(postsData)
            } else {
                errorLiveData.postValue(response.errorBody()?.string())
            }
        }
    }

}
package com.henriette.fetchingposts.model

import android.view.LayoutInflater
import android.view.ViewGroup

class PostsAdapter(var postsList: List<PostsData>):RecyclerView.Adapter<PostViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostsViewHolder {
        val binding =
            PostListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PostsViewHolder(binding)
    }
}
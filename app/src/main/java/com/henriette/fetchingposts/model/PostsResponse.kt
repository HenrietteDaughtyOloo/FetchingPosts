package com.henriette.fetchingposts.model

data class PostsResponse (
    var products: List<PostsData>,
    var total:Int,
    var  skip:Int,
    var limit:Int,
)
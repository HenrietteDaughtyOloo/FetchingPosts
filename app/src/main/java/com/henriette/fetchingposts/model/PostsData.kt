package com.henriette.fetchingposts.model
import androidx.room.Entity
import androidx.room.PrimaryKey

data class PostsData(
        var userId:Int,
        var id:Int,
        var title:String,
        var body:String,

    )






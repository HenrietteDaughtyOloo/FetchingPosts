package com.henriette.fetchingposts.model
import androidx.room.Entity
import androidx.room.PrimaryKey

class PostsData {
    @Entity(tableName = "Posts")
    class PostsData(
        @PrimaryKey(autoGenerate = true)
        var userId:Int,
        var id:Int,
        var title:String,
        var body:String,

    )
}





package com.henriette.fetchingposts.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import com.henriette.fetchingposts.model.PostsData

@Database(entities = arrayOf(PostsData::class), version = 1)

abstract class PostsDb {
    abstract fun getPostsDao(): PostsDao
    companion object{
        private var database: PostsDb? = null
        fun getDatabase(context: Context):PostsDb{
            if (database==null){
                database = Room.databaseBuilder(context,
                    PostsDb::class.java, "PostsDb")
                    .build()
            }
            return database as PostsDb
        }
    }
}
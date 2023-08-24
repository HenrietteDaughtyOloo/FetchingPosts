package com.henriette.fetchingposts.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.henriette.fetchingposts.model.PostsData

@Dao
interface PostsDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertContact(contact: PostsData)

    @Query("SELECT * FROM Posts ORDER BY id")
    fun getAllPosts(): LiveData<List<PostsData>>
}

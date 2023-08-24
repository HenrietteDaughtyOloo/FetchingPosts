package com.henriette.fetchingposts.ui

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.henriette.fetchingposts.R
import com.henriette.fetchingposts.viewmodel.PostsViewModel

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    val contactViewModel:PostsViewModel by viewModels()
    lateinit var btnAddContact: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=MainActivity.inflate(layoutInflater)

        setContentView(binding.root)
        binding.fabNew.setOnClickListener{
            val intent= Intent(this, newPost::class.java)
            startActivity(intent)
        }
    }


    override fun onResume() {
        super.onResume()
        PostsViewModel.getPosts().observe(this, Observer { postsList-> displayPosts(postList) })
        binding.fabNew.setOnClickListener{
            startActivity(Intent(this,newPost::class.java))
        }
    }
    fun displayPosts(contactList:List<PostsData>){
        val postAdapter= PostsAdapter(postList,this)
        binding.rvPosts.layoutManager= LinearLayoutManager(this)
        binding.rvPosts.adapter=postAdapter
    }
}
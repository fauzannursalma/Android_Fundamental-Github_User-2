package com.dicoding.githubusers.api

import com.dicoding.githubusers.model.DetailUserResponse
import com.dicoding.githubusers.model.User
import com.dicoding.githubusers.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    @GET("search/users")
    @Headers("Authorization: token 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")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>


    @GET("users/{username}")
    @Headers("Authorization: token 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")
    fun getDetailUsers(
        @Path("username") username: String
    ): Call<DetailUserResponse>


    @GET("users/{username}/followers")
    @Headers("Authorization: token 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")
    fun getFollowersUsers(
        @Path("username") username: String
    ): Call<ArrayList<User>>


    @GET("users/{username}/following")
    @Headers("Authorization: token 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")
    fun getFollowingUsers(
        @Path("username") username: String
    ): Call<ArrayList<User>>




}
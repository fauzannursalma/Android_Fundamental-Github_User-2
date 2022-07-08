package com.dicoding.githubusers.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DetailUserResponse(

    val login: String,
    val id: Int,
    val avatar_url: String,
    val followers_url: String,
    val name: String,
    val location: String,
    val public_repos: Int,
    val following: Int,
    val followers: Int
) : Parcelable

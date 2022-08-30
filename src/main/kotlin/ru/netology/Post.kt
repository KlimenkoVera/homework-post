package ru.netology

import java.util.*

data class Post (
    val id: Int,
    val fromId: Int,
    val text: String,
    val replyOwenId: Int = 0,
    val replyPostId: Int = 0,
    val postType: String = "post",
    val signerId: Int = 0,
    val canDelete: Boolean = true,
    val canEdit: Boolean = true,
    val markedAsAds: Boolean = false
//    val likes: Objects
        )

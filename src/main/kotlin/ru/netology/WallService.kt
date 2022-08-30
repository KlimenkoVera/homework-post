package ru.netology

object WallService {
    private var posts = emptyArray<Post>()
    private var lastId = 0

    fun add(post: Post): Int {
        lastId++
        val updatedPost = post.copy(id = lastId)
        posts += updatedPost

        return updatedPost.id
    }

    fun update(post: Post): Boolean {
        for ((index, item) in posts.withIndex()) {
            if (item.id == post.id) {
                posts[index] = post
                return true
            }
        }
        return false

    }

    fun clear() {
        posts = emptyArray()
    }
}


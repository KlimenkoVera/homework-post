package ru.netology

import org.junit.Assert.*
import org.junit.After
import org.junit.Before
import org.junit.Test

class WallServiceTest {

    @Before
    fun clearBeforeTest() {
        WallService.clear()
    }

    @Test
    fun update_ForTrue() {

        WallService.add(Post(-1, 35, "Netoligy"))
        WallService.add(Post(-1, 44, "Geography"))
        WallService.add(Post(-1, 43, "Geography"))

        val update = Post(8, 35, "Text")

        val result = WallService.update(update)

        assertTrue(result)
    }

    @Test
    fun update_ForFalse() {

        WallService.add(Post(-1, 35, "Netoligy"))
        WallService.add(Post(-1, 44, "Geography"))
        WallService.add(Post(-1, 43, "Geography"))

        val update = Post(4, 35, "Text")

        val result = WallService.update(update)

        assertFalse(result)
    }

    @Test
    fun add_IdIsDifferentFromZero() {

        val post = Post(-1, 23, "Netology")

        val result = WallService.add(post)

        assertNotEquals(0, result)
    }


}
package com.leonardoalves.data_cards

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, (2 + 2).toLong())
    }

    @Test
    fun testJoinToString() {
        val string = listOf<String>()
        assertEquals(null, string.joinToString(separator = "|").ifBlank { null })
        assertEquals("a|b", listOf("a", "b").joinToString(separator = "|").ifBlank { null })
    }
}
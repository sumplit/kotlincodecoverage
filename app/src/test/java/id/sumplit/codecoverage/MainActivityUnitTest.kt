package id.sumplit.codecoverage

import org.junit.Assert.*
import org.junit.Test

class MainActivityUnitTest {

    @Test
    fun perkalianTest_isCorrect() {
        assertEquals(4, Utils.perkalian(2, 2))
    }

    @Test
    fun perkalianTest_isNotCorrect() {
        assertNotEquals(6, Utils.perkalian(2, 2))
    }
}
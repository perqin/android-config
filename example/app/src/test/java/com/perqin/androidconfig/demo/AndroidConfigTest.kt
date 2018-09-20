package com.perqin.androidconfig.demo

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Created by perqin on 2018/09/20.
 */
class AndroidConfigTest {
    @Test
    fun buildConfigTest() {
        assertEquals("default", BuildConfig.CHANNEL)
    }
}
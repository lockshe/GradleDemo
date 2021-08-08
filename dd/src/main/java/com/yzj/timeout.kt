package com.yzj

import kotlinx.coroutines.*

fun main(){

    CoroutineScope(Dispatchers.IO).launch {
        withTimeoutOrNull(1000L) {
            delay(2000L)
        }
    }
}
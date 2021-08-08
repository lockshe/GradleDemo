package com.yzj

import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.coroutines.Continuation
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.startCoroutine

fun main() = runBlocking{
//    runOnUIThread {
//        delay(1000L)
//        // displaying UI
//        runOnIOThread {
//            delay(1000L)
//            // do network request or other long-running operations
//            runOnUIThread {
//                //get value and display UI
//
//                //endless callback hell.......
//            }
//        }
//    }
//
//    val fibonaci = sequence<Int> {
//        yield(1)
//        var next = 2
//        while (true){
//            yield(next)
//            next += 1
//        }
//    }
//
//    fibonaci.take(10).forEach (::println)
//
//
//    val coroutineContext = CoroutineName("test") + CoroutineExceptionHandler{ coroutineContext, throwable ->
//
//
//    }
//
//    suspend {
//        2
//    }.startCoroutine(object : Continuation<Int>{
//
//        override val context: CoroutineContext = coroutineContext
//
//        override fun resumeWith(result: Result<Int>) {
//
//        }
//    })


}


data class Myy(val a: String)

//fun test(block: suspend com.yzj.Myy.() -> Unit){
//    block.startCoroutine()
//}

fun Myy.start(){

}


fun <T> (T.() -> Unit).start(){}

suspend fun runOnIOThread(action: suspend () -> Unit) = action()

suspend fun runOnUIThread(action: suspend () -> Unit) = action()
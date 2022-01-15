package com.kwj
package t_with_java_p

object Timer {
    def main(args: Array[String]): Unit = {
        oncePerSecond(timeFlies)
    }

    def oncePerSecond(callback: () => Unit): Unit = {
        while (true) {
            callback()
            Thread sleep 1000
        }
    }

    def timeFlies(): Unit = {
        println("time flies like an arrow...")
    }
}

package com.kwj
package t_with_java_p

object TimerAnonymous {
    def main(args: Array[String]): Unit = {
        oncePerSecond(() => println("time flies like an arrow..."))
    }

    def oncePerSecond(callback: () => Unit): Unit = {
        while (true) {
            callback()
            Thread sleep 1000
        }
    }
}

package com.kwj
package t_with_java_p

object IntegerReference {
    def main(args: Array[String]): Unit = {
        val cell = new Reference[Int]
        cell.set(13)
        println("Reference contains the half of " + (cell.get * 2))
    }
}

package com.kwj
package t_with_java_p

object ComplexNumbers {
    def main(args: Array[String]): Unit = {
        val c = new Complex(1.2, 3.4)
        println("complex: " + c)
        println("imaginary part: " + c.im)
    }
}

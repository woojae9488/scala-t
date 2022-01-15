package com.kwj
package t_with_java_p

class Complex(real: Double, imaginary: Double) {
    def re: Double = real

    def im: Double = imaginary

    override def toString: String = "" + re + (if (im >= 0) "+" else "") + im + "i"
}
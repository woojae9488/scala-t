package com.kwj
package t_with_java_p

import java.text.DateFormat
import java.util.{Date, Locale}

object FranceDate {
    def main(args: Array[String]): Unit = {
        val now = new Date
        val dateFormat = DateFormat.getDateInstance(DateFormat.LONG, Locale.FRANCE)
        println(dateFormat format now)
    }
}

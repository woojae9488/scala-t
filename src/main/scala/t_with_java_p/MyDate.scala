package com.kwj
package t_with_java_p

class MyDate(y: Int, m: Int, d: Int) extends Ord {
    def year: Int = y

    def month: Int = m

    def day: Int = d

    override def toString: String = year + "-" + month + "-" + day

    override def equals(that: Any): Boolean =
        that.isInstanceOf[MyDate] && {
            val o = that.asInstanceOf[MyDate]
            o.day == day && o.month == month && o.year == year
        }

    override def <(that: Any): Boolean = {
        if (!that.isInstanceOf[MyDate])
            throw new RuntimeException("cannot compare " + that + " and a Date")

        val o = that.asInstanceOf[MyDate]
        (year < o.year) ||
            (year == o.year && (month < o.month ||
                (month == o.month && day < o.day)))
    }
}
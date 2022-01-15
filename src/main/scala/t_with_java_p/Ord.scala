package com.kwj
package t_with_java_p

trait Ord {
    def <(that: Any): Boolean

    def <=(that: Any): Boolean = (this < that) || (this == that)

    def >(that: Any): Boolean = !(this <= that)

    def >=(that: Any): Boolean = !(this < that)
}

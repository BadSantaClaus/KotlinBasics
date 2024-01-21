package test

import divide


class IfTest {
    companion object {
        fun ifTest(age: Int?) {
            if (age in 12..23) {
                println("hi")
            }

            when (age) {
                18 -> println("when 18")
                21 -> println("when 21")
                else -> println("nothing")
            }

            divide()
        }
    }
}
package org.example

class LoopTest {
    companion object {
        fun loopTest() {
            println("=standard=")
            for (i in 1..2) {
                println("loop $i")
            }
            println("=step=")
            for (i in 1..4 step 2) {
                println("loop $i")
            }
            println("=downTo=")
            for (i in 10 downTo 2 step 2) {
                println("loop $i")
            }

            divide()
        }
    }
}
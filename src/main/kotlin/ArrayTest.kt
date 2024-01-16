package org.example

class ArrayTest {
    companion object {
        fun arrayTest(array: Array<Int>) {
            array.get(0)
            array.set(0, 2)
            println("=array size=")
            println(array.size)

            println("=loop array for=")

            for (i in array) {
                println(i)
            }

            println("=loop array fori=")
            for (i in array.indices) {
                println(array.get(i))
            }

            println("=loop array forEach=")
            array.forEach { el -> println(el) }

            println("=loop array forEach=")
            array.forEachIndexed { index, element ->
                println("$element has index $index")
            }

            divide()
        }
    }
}
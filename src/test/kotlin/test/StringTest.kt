package test

import divide
import java.util.*

class StringTest {
    val s: String = "Hello Kotlin"

    companion object {
        fun stringTest(word: String) {
            println("==s.first, s.last==")
            println("first - ${word.first()} , last - ${word.last()}")
            println("==first char Up and Down==")
            println(word.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() })
            println(word.replaceFirstChar { it.lowercase(Locale.getDefault()) })
            divide()
        }

        fun blankEmptyTest(word: String) {
            println("==blank and empty==")
            println("blank - ${word.isBlank()}")
            println("empty - ${word.isEmpty()}")
            divide()
        }

        fun trimTest(word: String) {
            println("==trim==")
            println("trimStart - \"${word.trimStart()}\"")
            println("trimEnd - \"${word.trimEnd()}\"")
            println("trim - \"${word.trim()}\"")
            divide()
        }

        fun readLineTest() {
            val t = readln()
            println("line is \"${t.lowercase(Locale.getDefault())}\"")
            divide()
        }
    }
}
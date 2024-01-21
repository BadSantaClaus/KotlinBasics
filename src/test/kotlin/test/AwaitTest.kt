package test

import org.awaitility.Awaitility.await
import org.awaitility.core.ConditionTimeoutException
import java.util.concurrent.TimeUnit

class AwaitTest {

    companion object {
        fun awaitTest() {
            var i: Int = 0
            try {
                await()
                    .atMost(5, TimeUnit.SECONDS)
                    .pollInterval(2, TimeUnit.SECONDS)
                    .until { i == 20 }
            } catch (e: ConditionTimeoutException) {
                println(e.message)
            }


        }
    }

}
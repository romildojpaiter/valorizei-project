package br.com.paiter.valorizeiapi.messaging

import org.springframework.stereotype.Component
import java.util.concurrent.CountDownLatch

@Component
class Receiver {

    val latch = CountDownLatch(1)

    fun receiveMessage(message: String) {
        println("Received <$message>")
        latch.countDown();
    }

}
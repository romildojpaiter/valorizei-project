package br.com.paiter.valorizeiapi.services

import br.com.paiter.valorizeiapi.messaging.ReceiverMessenger
import org.springframework.stereotype.Service
import java.util.logging.Logger

@Service
class ReceiverService(val receiverMessenger : ReceiverMessenger) {

    val log = Logger.getLogger(ReceiverService::class.java.name)

    companion object {
        // val log2 = Logger.getLogger(javaClass<ReceiverService>())
    }

    fun sendMessage(message: String) {
//        var custumer = Custumer("Romildo")
//        println(custumer.name)
//        println(custumer.placeOrder())

        log.info(">> Enviando Mensagem para o Rabbitmq")
        receiverMessenger.sendMessage(message)
    }

}

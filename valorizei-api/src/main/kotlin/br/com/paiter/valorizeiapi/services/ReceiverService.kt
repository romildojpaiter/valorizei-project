package br.com.paiter.valorizeiapi.services

import br.com.paiter.valorizeiapi.messaging.ReceiverMessenger
import br.com.paiter.valorizeiapi.repositories.UserRepository
import org.springframework.stereotype.Service

@Service
class ReceiverService(val receiverMessenger : ReceiverMessenger) {

    fun sendMessage(message: String) {
        receiverMessenger.sendMessage(message)
    }

}

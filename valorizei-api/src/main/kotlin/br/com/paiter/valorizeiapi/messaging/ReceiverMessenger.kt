package br.com.paiter.valorizeiapi.messaging

import br.com.paiter.valorizeiapi.config.MessagingRabbitConfig
import org.springframework.amqp.rabbit.core.RabbitTemplate
import org.springframework.stereotype.Component
import java.util.concurrent.TimeUnit

@Component
class ReceiverMessenger(val receiver: Receiver, val rabbitTemplate: RabbitTemplate) {

    fun sendMessage(message: String) {
        rabbitTemplate.convertAndSend(MessagingRabbitConfig.topicExchangeName, "br.paiter.faz", message)
        receiver.latch.await(100000, TimeUnit.MILLISECONDS)
    }

}
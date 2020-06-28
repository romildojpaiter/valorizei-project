package br.com.paiter.valorizeiapi.resources

import br.com.paiter.valorizeiapi.services.ReceiverService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("receiver")
class ReceiverResource(val receiverService: ReceiverService) {


    @GetMapping("/{message}")
    fun receiveMessage(@PathVariable("message") message : String) {
        receiverService.sendMessage(message)
    }

}
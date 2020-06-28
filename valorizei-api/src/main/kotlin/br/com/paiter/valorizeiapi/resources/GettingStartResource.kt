package br.com.paiter.valorizeiapi.resources

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/gettingstart")
class GettingStartResource {

    @GetMapping
    fun helloWorld() : String = "Hello World"

    @GetMapping("/{name}")
    fun helloWorld(@PathVariable name: String) : String = "Hello World, $name"

}
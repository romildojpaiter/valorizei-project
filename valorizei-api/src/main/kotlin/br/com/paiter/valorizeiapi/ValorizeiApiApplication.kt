package br.com.paiter.valorizeiapi

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
class ValorizeiApiApplication

fun main(args: Array<String>) {
	runApplication<ValorizeiApiApplication>(*args)
}

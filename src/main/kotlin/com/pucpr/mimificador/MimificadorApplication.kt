package com.pucpr.mimificador

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MimificadorApplication

fun main(args: Array<String>) {
	runApplication<MimificadorApplication>(*args)
}

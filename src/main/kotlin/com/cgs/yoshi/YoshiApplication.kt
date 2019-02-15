package com.cgs.yoshi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class YoshiApplication

fun main(args: Array<String>) {
	runApplication<YoshiApplication>(*args)
}


package me.winter.daf

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DafApplication

fun main(args: Array<String>) {
	runApplication<DafApplication>(*args)
}

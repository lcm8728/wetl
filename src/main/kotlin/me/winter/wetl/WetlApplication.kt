package me.winter.wetl

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WetlApplication

fun main(args: Array<String>) {
	runApplication<WetlApplication>(*args)
}

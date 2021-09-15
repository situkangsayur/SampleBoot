package com.rumaysho.sample.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(basePackages = ["com.rumaysho.sample"])
class SampleSpringApplication

fun main(args: Array<String>) {
  runApplication<SampleSpringApplication>(*args)
}

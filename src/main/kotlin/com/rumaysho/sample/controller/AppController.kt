package com.rumaysho.sample.app

import com.rumaysho.sample.services.SampleService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class AppController(@Autowired val service: SampleService) {

  @GetMapping("/") fun index(): String = service.helloName("gaes")
}

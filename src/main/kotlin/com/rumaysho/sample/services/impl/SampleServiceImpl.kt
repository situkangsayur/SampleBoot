package com.rumaysho.sample.services.impl

import com.rumaysho.sample.services.SampleService
import org.springframework.stereotype.Service

@Service
class SampleServiceImpl : SampleService {

  override fun helloName(name: String): String {
    // business logic
    return "hello " + name
  }
}

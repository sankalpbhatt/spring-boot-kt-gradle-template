package com.example.module.service

import org.springframework.stereotype.Service

@Service
class AppServiceImpl: AppService {

    override fun sayHello(): String {
        return "Hello!"
    }
}
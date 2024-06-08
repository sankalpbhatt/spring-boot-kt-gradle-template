package com.example.module.controller

import com.example.module.service.AppService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hello")
class AppController(private val appService: AppService) {


    @GetMapping
    fun sayHello(): String{
        return appService.sayHello()
    }
}
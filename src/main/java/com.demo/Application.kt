package com.demo
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer

@SpringBootApplication
open class Application: SpringBootServletInitializer()


    fun main(args: Array<String>){
        SpringApplication.run(Application::class.java)
    }

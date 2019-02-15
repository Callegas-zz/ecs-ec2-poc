package com.cgs.yoshi

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/yoshi")
class YoshiRest {

    @Value("\${yoshi}")
    private val yoshi: String? = null

    @GetMapping
    fun yoshi() = yoshi

}
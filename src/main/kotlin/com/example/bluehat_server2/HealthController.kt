package com.example.bluehat_server2

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody


@Controller
class HealthController {
    @RequestMapping(value = ["/", "/health"], method = [RequestMethod.GET, RequestMethod.POST])
    @ResponseBody
    fun health(): String {
        return "Health Good"
    }
}


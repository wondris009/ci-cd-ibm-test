package cz.speedygonzales.cicdibmdemo

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class GreetingController {

    @GetMapping("/")
    fun index() = "index"
}
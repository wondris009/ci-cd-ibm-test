package cz.speedygonzales.cicdibmdemo

import org.springframework.context.ApplicationContext
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping


@Controller
class IndexController(private val context: ApplicationContext) {

    @GetMapping("/")
    fun index() = "index"
}
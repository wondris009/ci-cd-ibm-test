package cz.speedygonzales.cicdibmdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CiCdIbmDemoApplication

fun main(args: Array<String>) {
    runApplication<CiCdIbmDemoApplication>(*args)
}

package cz.speedygonzales.cicdibmdemo

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@RestController
class PostgresController(private val repository: TestRepository) {

    private val bluer = Bluer()

    @GetMapping("/data")
    fun getTestData() = bluer.makeItBlue(repository.findAll().map { it.name }.joinToString())
}

@Repository
interface TestRepository : JpaRepository<Test, Long>

class Bluer {
    fun makeItBlue(input: String) = "<div style=\"color:blue;\"><h1>$input</h1></div>"
}

@Entity
@Table(name = "test")
class Test {

    @Id
    @GeneratedValue
    var id: Long? = null
    var name:String? = null
}
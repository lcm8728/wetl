package me.winter.wetl.interfaces

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
class DafController {

    @GetMapping("/healthCheck")
    fun healthCheck(): Mono<String> {
        return Mono.just("ok")
    }

}
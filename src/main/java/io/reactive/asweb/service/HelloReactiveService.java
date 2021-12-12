//package io.reactive.asweb.service;
//
//import org.springframework.http.MediaType;
//import org.springframework.stereotype.Service;
//import org.springframework.web.reactive.function.BodyInserters;
//import org.springframework.web.reactive.function.server.ServerRequest;
//import org.springframework.web.reactive.function.server.ServerResponse;
//import reactor.core.publisher.Mono;
//
//@Service
//public class HelloReactiveService {
//
//    public Mono<ServerResponse> hello(ServerRequest request) {
//        System.out.println(request.exchange().getRequest().getQueryParams());
//        return ServerResponse.ok()
//                .contentType(MediaType.APPLICATION_JSON)
//                .body(BodyInserters.fromValue("{'key':'ok'}"));
//    }
//}

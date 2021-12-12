//package io.reactive.asweb.controller;
//
//import io.reactive.asweb.service.HelloReactiveService;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.MediaType;
//import org.springframework.web.reactive.function.server.RequestPredicates;
//import org.springframework.web.reactive.function.server.RouterFunction;
//import org.springframework.web.reactive.function.server.RouterFunctions;
//import org.springframework.web.reactive.function.server.ServerResponse;
//
//@Configuration
//public class ReactiveWebController {
//
//    @Bean
//    public RouterFunction<ServerResponse> monoRouteFunction(HelloReactiveService service) {
//        return RouterFunctions.route(RequestPredicates.GET("/info"), service::hello)
//                .andRoute(RequestPredicates.all(), request -> {
//                    return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).bodyValue("all");
//                });
//    }
//}

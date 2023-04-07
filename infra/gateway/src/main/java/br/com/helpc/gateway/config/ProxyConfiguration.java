package br.com.helpc.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProxyConfiguration {
    public static final String HTTP_COURSE = "http://localhost:8082";
    @Bean
    public RouteLocator defaultRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(p -> p
                        .path("/v1/admin/course")
                        .uri(HTTP_COURSE))
                .build();
    }
}

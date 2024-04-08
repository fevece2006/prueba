package com.fvelasquez.prueba.infraestructure.rules;
import com.fvelasquez.prueba.domain.model.Product;
import io.github.resilience4j.circuitbreaker.CircuitBreaker;
import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig;

import io.github.resilience4j.reactor.circuitbreaker.operator.CircuitBreakerOperator;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

import java.time.Duration;

@Component
public class ProductCircuitBreaker {

    private final CircuitBreaker circuitBreaker;

    public ProductCircuitBreaker() {
        CircuitBreakerConfig config = CircuitBreakerConfig.custom()
                .failureRateThreshold(50)
                .waitDurationInOpenState(Duration.ofMillis(1000))
                .build();
        circuitBreaker = CircuitBreaker.of("productService", config);
    }

    /*
    public Mono<Product> getProductByIdWithCircuitBreaker(String id) {
        return Mono.fromCallable(() -> getProductById(id))
                .transform(CircuitBreakerOperator.of(circuitBreaker));
    }
*/
    private Mono<Product> getProductById(String id) {
        // Implement your service call here
        return null;
    }
}
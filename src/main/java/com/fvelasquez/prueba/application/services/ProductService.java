package com.fvelasquez.prueba.application.services;

import com.fvelasquez.prueba.domain.model.Product;
import com.fvelasquez.prueba.domain.port.ProductRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public Flux<Product> getAllProducts() {
        return repository.findAll();
    }

    public Mono<Product> getProductById(String id) {
        return repository.findById(id);
    }

    public Mono<Product> createProduct(Product product) {
        return repository.save(product);
    }

    public Mono<Void> deleteProductById(String id) {
        return repository.deleteById(id);
    }

    public Mono<Product> updateProductById(String id, Product product) {
        return repository.findById(id)
                .flatMap(existingProduct -> {
                    existingProduct.setName(product.getName());
                    existingProduct.setPrice(product.getPrice());
                    return repository.save(existingProduct);
                });
    }

}

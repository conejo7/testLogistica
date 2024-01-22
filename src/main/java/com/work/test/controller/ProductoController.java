package com.work.test.controller;


import com.work.test.model.pojo.Producto;
import com.work.test.model.request.CreateProductRequest;
import com.work.test.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@Slf4j
public class ProductoController {

    private final ProductService service;

    @GetMapping("/products")
    public ResponseEntity<List<Producto>> getProducts(@RequestHeader Map<String, String> headers) {
        log.info("headers: {}", headers);
        List<Producto> products = service.getProducts();
        System.out.println(products);
        if (products != null) {
            return ResponseEntity.ok(products);
        } else {
            return ResponseEntity.ok(Collections.emptyList());
        }
    }

    @GetMapping("/products/{productId}")
    public ResponseEntity<Producto> getProduct(@PathVariable Integer productId) {
        log.info("Request received for product {}", productId);
        Producto product = service.getProduct(productId);
        if (product != null) {
            return ResponseEntity.ok(product);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/products/{productId}")
    public ResponseEntity<Producto> updateProduct(@PathVariable Integer productId, @RequestBody Producto productosimple) {
        Producto product = service.updateProduct(productId,productosimple);
        if (product != null) {
            return ResponseEntity.ok(product);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/products")
    public ResponseEntity<Producto> getProduct(@RequestBody CreateProductRequest request) {
        Producto createdProduct = service.createProduct(request);
        if (createdProduct != null) {
            return ResponseEntity.status(HttpStatus.CREATED).body(createdProduct);
        } else {
            return ResponseEntity.badRequest().build();
        }
    }

    @DeleteMapping("/products/{productId}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Integer productId) {

        Boolean removed = service.removeProduct(productId);
        if (Boolean.TRUE.equals(removed)) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }



}

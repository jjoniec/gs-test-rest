package com.aws.codestar.projecttemplates.controller;

import com.aws.codestar.projecttemplates.dao.Product;
import com.aws.codestar.projecttemplates.jpa.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Basic Spring web service controller that handles all GET requests.
 */
@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> helloWorldGet() {
        Iterable<Product> allProducts = productRepository.findAll();
        return ResponseEntity.ok(allProducts);
    }
}

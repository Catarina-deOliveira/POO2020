package pt.iade.OnlineGoods.controllers;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.iade.OnlineGoods.models.Product;
import pt.iade.OnlineGoods.models.exceptions.NotFoundException;
import pt.iade.OnlineGoods.models.repositories.ProductRepository;

@RestController
@RequestMapping(path = "/api/products")
public class ProductController {
    private Logger logger = LoggerFactory.getLogger(ProductController.class);
    @Autowired
    private ProductRepository productRepository;

    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Product> getProducts() {
        logger.info("Sending all Products");
        return productRepository.findAll();
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Product getProduct(@PathVariable int id) {
        logger.info("Sending product with id " + id);
        Optional<Product> _product = productRepository.findById(id);
        if (_product.isEmpty())
            throw new NotFoundException("" + id, "Product", "id");
        else
            return _product.get();
    }

    @PostMapping(path = "/{productID}/products", produces = MediaType.APPLICATION_JSON_VALUE)
    public Product updateProduct(@RequestBody Product product, @PathVariable int id) {

        return productRepository.save(product);
    }
}
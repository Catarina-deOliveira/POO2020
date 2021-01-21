package pt.iade.OnlineGoods.controllers;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.iade.OnlineGoods.models.Category;
import pt.iade.OnlineGoods.models.exceptions.NotFoundException;
import pt.iade.OnlineGoods.models.repositories.CategoryRepository;

@RestController
@RequestMapping(path = "/api/categoria")
public class CategoryController {
    private Logger logger = LoggerFactory.getLogger(CategoryController.class);
    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Category> getCategories() {
        logger.info("Sending all Categories");
        return categoryRepository.findAll();
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Category getCategory(@PathVariable int id) {
        logger.info("Sending category with id " + id);
        Optional<Category> _categoria = categoryRepository.findById(id);
        if (_categoria.isEmpty())
            throw new NotFoundException("" + id, "Category", "id");
        else
            return _categoria.get();
    }

}
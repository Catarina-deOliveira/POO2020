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

import pt.iade.OnlineGoods.models.ShoppingCart;
import pt.iade.OnlineGoods.models.exceptions.NotFoundException;
import pt.iade.OnlineGoods.models.repositories.ShoppingcartRepository;
import pt.iade.OnlineGoods.models.views.ShoppingCartProductView;

@RestController
@RequestMapping(path = "/api/shoppingcart")
public class ShoppingCartController {
    private Logger logger = LoggerFactory.getLogger(PackageController.class);
    @Autowired
    private ShoppingcartRepository shoppingcartRepository;

    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<ShoppingCart> getShoppingCart() {
        logger.info("Sending ShoppingCart");
        return shoppingcartRepository.findAll();
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ShoppingCart getShoppingCart(@PathVariable int id) {
        logger.info("Sending shoppingcart with id " + id);
        Optional<ShoppingCart> _shoppingcart = shoppingcartRepository.findById(id);
        if (_shoppingcart.isEmpty())
            throw new NotFoundException("" + id, "ShoppingCart", "id");
        else
            return _shoppingcart.get();
    }

    @GetMapping(path = "/{id}/products", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<ShoppingCartProductView> getShoppingCartProducts(@PathVariable int id) {
        logger.info("Sending all products inside the shopping cart with id " + id);
        return shoppingcartRepository.findShoppingCartProducts(id);
    }

    @PostMapping(path = "/{id}/products", produces = MediaType.APPLICATION_JSON_VALUE)
    public int saveShoppingCartContent(@PathVariable int id, @RequestBody ShoppingCartProductView shoppingcart) {
        logger.info("Saving content on Shopping Cart with id: " + id);
        return shoppingcartRepository.saveShoppingCartContent(id, shoppingcart);
    }

}
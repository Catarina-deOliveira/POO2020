package pt.iade.OnlineGoods.models.repositories;

import org.springframework.data.repository.CrudRepository;

import pt.iade.OnlineGoods.models.ShoppingCart;

public interface ShoppingcartRepository extends CrudRepository<ShoppingCart, Integer> {

}
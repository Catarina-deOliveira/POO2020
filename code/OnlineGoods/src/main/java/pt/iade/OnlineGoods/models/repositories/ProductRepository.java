package pt.iade.OnlineGoods.models.repositories;

import org.springframework.data.repository.CrudRepository;

import pt.iade.OnlineGoods.models.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}

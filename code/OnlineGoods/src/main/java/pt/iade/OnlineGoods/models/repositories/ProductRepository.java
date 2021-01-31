package pt.iade.OnlineGoods.models.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import pt.iade.OnlineGoods.models.Product;
import pt.iade.OnlineGoods.models.views.ProductView;

public interface ProductRepository extends CrudRepository<Product, Integer> {
    // Novo
    String productQuery = "select product_name, product_price, product_reference, product_stock from product";

    // Novo
    @Query(value = productQuery, nativeQuery = true)
    Iterable<ProductView> findProducts(@Param("product_id") int productID);
}

package pt.iade.OnlineGoods.models.repositories;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import pt.iade.OnlineGoods.models.ShoppingCart;
import pt.iade.OnlineGoods.models.views.ShoppingCartProductView;

public interface ShoppingcartRepository extends CrudRepository<ShoppingCart, Integer> {

    String shoppingcartQuery = "SELECT product_name as productname, product_price as productprice, shoppingcart_id as shoppingcartID, "
            + "From product, shoppingcart " + "Where product_shoppingcart_id = shoppingcart_id";

    @Query(value = shoppingcartQuery, nativeQuery = true)
    Iterable<ShoppingCartProductView> findShoppingCartProducts(@Param("shoppingcart_id") int shoppingcart_id);

    String saveShoppingCartContentQuery = "INSERT INTO shoppingcart (shoppingcart_id, product_name, product_price, "
            + "VALUES (:shoppingcart_id, :#{#shoppingcart.getProductName()}, :#{#shoppingcart.getProductPrice()})";

    @Modifying
    @Transactional
    @Query(value = saveShoppingCartContentQuery, nativeQuery = true)
    int saveShoppingCartContent(@Param("shoppingcart_id") int shoppingcart_id,
            @Param("shoppingcart") ShoppingCartProductView shoppingcart);
}

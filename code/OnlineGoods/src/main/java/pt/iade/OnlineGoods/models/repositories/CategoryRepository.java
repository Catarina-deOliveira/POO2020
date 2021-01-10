package pt.iade.OnlineGoods.models.repositories;

import org.springframework.data.repository.CrudRepository;

import pt.iade.OnlineGoods.models.Category;

public interface CategoryRepository extends CrudRepository<Category, Integer> {

}

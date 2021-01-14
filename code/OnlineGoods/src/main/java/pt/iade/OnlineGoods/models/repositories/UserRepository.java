package pt.iade.OnlineGoods.models.repositories;

import org.springframework.data.repository.CrudRepository;

import pt.iade.OnlineGoods.models.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}

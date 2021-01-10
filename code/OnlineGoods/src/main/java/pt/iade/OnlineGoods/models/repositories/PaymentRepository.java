package pt.iade.OnlineGoods.models.repositories;

import org.springframework.data.repository.CrudRepository;

import pt.iade.OnlineGoods.models.Payment;

public interface PaymentRepository extends CrudRepository<Payment, Integer> {

}

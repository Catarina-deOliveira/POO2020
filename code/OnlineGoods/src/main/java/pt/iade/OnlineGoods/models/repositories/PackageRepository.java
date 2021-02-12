package pt.iade.OnlineGoods.models.repositories;

import org.springframework.data.repository.CrudRepository;
import pt.iade.OnlineGoods.models.Package;

public interface PackageRepository extends CrudRepository<Package, Integer> {
    // Iterable<Package> findByPackage_ClientID(int id);
}

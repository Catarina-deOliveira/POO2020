package pt.iade.OnlineGoods.models.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import pt.iade.OnlineGoods.models.Package;
import pt.iade.OnlineGoods.models.views.PackageView;

public interface PackageRepository extends CrudRepository<Package, Integer> {
    String packageQuery = "SELECT package_reference as packagereference, client_name as clientname, client_nif as clientnif, "
            + "From package, client " + "Where package_client_id = client_id";

    @Query(value = packageQuery, nativeQuery = true)
    Iterable<PackageView> findPackageInformation(@Param("client_id") int client_id);

    String savepackageQuery = "INSERT INTO package (client_id, package_reference, client_name, client_nif"
            + "VALUES (:client_id, :#{#package.getPackageReference()}, :#{#package.getClientName()}, :#{#package.getClientNif()})";

    /*
     * @Modifying
     * 
     * @Transactional
     * 
     * @Query(value = savepackageQuery, nativeQuery = true) int
     * savePackageInformation(@Param("client_id") int client_id, @Param("package")
     * PackageView package);
     * 
     * @Modifying
     * 
     * @Transactional
     * 
     * @Query(value = savepackageQuery, nativeQuery = true) int
     * saveShoppingCartContent(@Param("client_id") int client_id,
     * 
     * @Param("package") PackageView package); // Iterable<Package>
     * findByPackage_ClientID(int id);
     */
}

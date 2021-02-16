package pt.iade.OnlineGoods.models.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import pt.iade.OnlineGoods.models.Package;
import pt.iade.OnlineGoods.models.views.PackageInsertView;
import pt.iade.OnlineGoods.models.views.PackageView;

public interface PackageRepository extends CrudRepository<Package, Integer> {
        String packageQuery = "SELECT package_reference as packageReference, client_name as clientName, client_nif as clientNif "
                        + "From package, client " + "Where package_client_id = client_id and client_id = :client_id ";

        @Query(value = packageQuery, nativeQuery = true)
        Iterable<PackageView> findPackageInformation(@Param("client_id") int client_id);

        String savepackageQuery = "INSERT INTO package (package_client_id, package_reference, package_product_id, package_payment_id) "
                        + "VALUES (:#{#package.getPackageClientId()}, :#{#package.getPackageReference()}, :#{#package.getPackageProductId()}, :#{#package.getPackagePaymentId()})";

        @Modifying
        @Transactional
        @Query(value = savepackageQuery, nativeQuery = true)
        int savePackageInformation(@Param("package") PackageInsertView pacote);

        /*
         * @Modifying
         * 
         * @Transactional
         * 
         * @Query(value = savepackageQuery, nativeQuery = true) int
         * 
         * saveShoppingCartContent(@Param("client_id") int client_id,
         * 
         * @Param("package") PackageView package); // Iterable<Package>
         * 
         * findByPackage_ClientID(int id);
         */

}

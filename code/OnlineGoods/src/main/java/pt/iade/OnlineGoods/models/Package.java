package pt.iade.OnlineGoods.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "package")
public class Package {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "package_id")
    private int packageID;
    @Column(name = "package_reference")
    private int reference;
    @Column(name = "package_product_id")
    private int package_productID;
    @Column(name = "package_payment_id")
    private int package_paymentID;
    @Column(name = "package_client_id")
    private int package_clientID;

    public Package() {
    }

    public Package(int packageID, int reference, int package_productID, int package_paymentID, int package_clientID) {
        this.packageID = packageID;
        this.reference = reference;
        this.package_productID = package_productID;
        this.package_paymentID = package_paymentID;
        this.package_clientID = package_clientID;
    }

    public int getPackageID() {
        return packageID;
    }

    public void setPackageID(int packageID) {
        this.packageID = packageID;
    }

    public int getReference() {
        return reference;
    }

    public void setReference(int reference) {
        this.reference = reference;
    }

    public int getPackage_productID() {
        return package_productID;
    }

    public void setPackage_productID(int package_productID) {
        this.package_productID = package_productID;
    }

    public int getPackage_paymentID() {
        return package_paymentID;
    }

    public void setPackage_paymentID(int package_paymentID) {
        this.package_paymentID = package_paymentID;
    }

    public int getPackage_clientID() {
        return package_clientID;
    }

    public void setPackage_clientID(int package_clientID) {
        this.package_clientID = package_clientID;
    }

}

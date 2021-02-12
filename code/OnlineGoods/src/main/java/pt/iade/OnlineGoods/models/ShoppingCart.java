package pt.iade.OnlineGoods.models;

//import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "shoppingcart")
public class ShoppingCart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "shoppingcart_id")
    private int shoppingcartID;
    // @Column(name = "shoppingcart_date")
    // private Date shoppingcartDate;

    /*
     * @ManyToOne
     * 
     * @JoinColumn(name = "client_id") private Client client;
     * 
     * @ManyToOne
     * 
     * @JoinColumn(name = "admin_id") private Admin admin;
     */

    @OneToMany
    @JoinColumn(name = "product_shoppingcart_id")
    @JsonIgnoreProperties({ "shoppingcart" })
    private List<Product> product;

    // private int shoppingcartState;
    public ShoppingCart() {

    }

    public ShoppingCart(int shoppingcartID,
            /* Date shoppingcartDate, Client client, Admin admin, */ List<Product> product
    /* ShoppingCartState shoppingcartState */) {
        this.shoppingcartID = shoppingcartID;
        // this.shoppingcartDate = shoppingcartDate;
        /*
         * this.client = client; this.admin = admin;
         */
        this.product = product;
        // setShoppingCartState(shoppingcartState);
    }

    public int getShoppingcartID() {
        return shoppingcartID;
    }

    public void setShoppingcartID(int shoppingcartID) {
        this.shoppingcartID = shoppingcartID;
    }

    /*
     * public Date getShoppingcartDate() { return shoppingcartDate; }
     * 
     * public void setShoppingcartDate(Date shoppingcartDate) {
     * this.shoppingcartDate = shoppingcartDate; }
     */

    /*
     * public Client getClient() { return client; }
     * 
     * public void setClient(Client client) { this.client = client; }
     */

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }

    /*
     * public ShoppingCartState getShoppingCartState() { return
     * ShoppingCartState.valueOf(shoppingcartState); }
     * 
     * public void setShoppingCartState(ShoppingCartState shoppingcartState) { if
     * (shoppingcartState != null) { this.shoppingcartState =
     * shoppingcartState.getState(); } }
     */

    /*
     * public Admin getAdmin() { return admin; }
     * 
     * public void setAdmin(Admin admin) { this.admin = admin; }
     */

}

package pt.iade.OnlineGoods.models;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ShoppingCart")
public class ShoppingCart implements Sellable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "shoppingcart_id")
    private int shoppingcartID;
    @Column(name = "shoppingcart_date")
    private Date shoppingcartDate;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private User client;

    private int shoppingcartState;

    @Override
    public String getSold() {
        // TODO Auto-generated method stub
        return null;
    }

    public ShoppingCart(int shoppingcartID, Date shoppingcartDate, User client, ShoppingCartState shoppingcartState) {
        this.shoppingcartID = shoppingcartID;
        this.shoppingcartDate = shoppingcartDate;
        this.client = client;
        setShoppingCartState(shoppingcartState);
    }

    public int getShoppingcartID() {
        return shoppingcartID;
    }

    public void setShoppingcartID(int shoppingcartID) {
        this.shoppingcartID = shoppingcartID;
    }

    public Date getShoppingcartDate() {
        return shoppingcartDate;
    }

    public void setShoppingcartDate(Date shoppingcartDate) {
        this.shoppingcartDate = shoppingcartDate;
    }

    public User getClient() {
        return client;
    }

    public void setClient(User client) {
        this.client = client;
    }

    public ShoppingCartState getShoppingCartState() {
        return ShoppingCartState.valueOf(shoppingcartState);
    }

    public void setShoppingCartState(ShoppingCartState shoppingcartState) {
        if (shoppingcartState != null) {
            this.shoppingcartState = shoppingcartState.getState();
        }
    }

}

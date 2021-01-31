package pt.iade.OnlineGoods.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "product_id")
    private int productID;
    @Column(name = "product_name")
    private String name;
    @Column(name = "product_price")
    private double price;
    @Column(name = "product_reference")
    private int reference;
    @Column(name = "product_stock")
    private int stock;

    @ManyToOne
    @JoinColumn(name = "product_category_id")
    @JsonIgnoreProperties({ "product" })
    private Category category;
    /*
     * X produtos dentro de um carrinho
     * 
     * @ManyToOne
     * 
     * @JoinColumn(name = "product_shoppingcart_id")
     * 
     * @JsonIgnoreProperties({ "product" }) private ShoppingCart shoppingCart;
     */

    public Product() {
    }

    public Product(int productID, String name, double price, int reference, int stock, Category category) {
        this.productID = productID;
        this.name = name;
        this.price = price;
        this.reference = reference;
        this.stock = stock;
        this.category = category;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getReference() {
        return reference;
    }

    public void setReference(int reference) {
        this.reference = reference;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

}

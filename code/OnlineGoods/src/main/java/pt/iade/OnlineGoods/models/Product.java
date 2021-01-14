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
@Table(name = "producto")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "producto_id")
    private int productoID;
    @Column(name = "producto_name")
    private String name;
    @Column(name = "producto_price")
    private double price;
    @Column(name = "producto_reference")
    private int reference;
    @Column(name = "producto_stock")
    private int stock;

    @ManyToOne
    @JoinColumn(name = "producto_categoria_id")
    @JsonIgnoreProperties({ "producto" })
    private Category category;

    public Product() {
    }

    public Product(int productoID, String name, double price, int reference, int stock, Category category) {
        this.productoID = productoID;
        this.name = name;
        this.price = price;
        this.reference = reference;
        this.stock = stock;
        this.category = category;
    }

    public int getProductoID() {
        return productoID;
    }

    public void setProductoID(int productoID) {
        this.productoID = productoID;
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

package pt.iade.OnlineGoods.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "categoria")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "categoria_id")
    private int categoriaID;
    @Column(name = "categoria_name")
    private String name;

    @OneToMany
    @JoinColumn(name = "producto_categoria_id")
    @JsonIgnoreProperties({ "categoria" })
    private List<Product> product;

    public Category() {
    }

    public Category(int categoriaID, String name, List<Product> product) {
        this.categoriaID = categoriaID;
        this.name = name;
        this.product = product;
    }

    public int getCategoriaID() {
        return categoriaID;
    }

    public void setCategoriaID(int categoriaID) {
        this.categoriaID = categoriaID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }

}

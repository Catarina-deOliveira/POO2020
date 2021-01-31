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
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "client_id")
    private int clientID;
    @Column(name = "client_name")
    private String name;
    @Column(name = "client_username")
    private String username;
    @Column(name = "client_password")
    private String password;
    @Column(name = "client_email")
    private String email;
    @Column(name = "client_address")
    private String address;
    @Column(name = "client_nif")
    private int nif;
    /*
     * 1 cliente pode fazer X encomendas
     * 
     * @ManyToOne
     * 
     * @JoinColumn(name = "package_client_id")
     * 
     * @JsonIgnoreProperties({ "client" }) private Package package;
     */

    public Client() {
    }

    public Client(int clientID, String name, String username, String password, String email, String address, int nif) {
        this.clientID = clientID;
        this.name = name;
        this.username = username;
        this.password = password;
        this.email = email;
        this.address = address;
        this.nif = nif;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNif() {
        return nif;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

}
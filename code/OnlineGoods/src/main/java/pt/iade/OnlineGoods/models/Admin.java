package pt.iade.OnlineGoods.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "admin_id")
    private int adminID;
    @Column(name = "admin_name")
    private String name;
    @Column(name = "admin_username")
    private String username;
    @Column(name = "admin_password")
    private String password;
    @Column(name = "admin_email")
    private String email;

    public Admin() {
    }

    public Admin(int adminID, String name, String username, String password, String email) {
        this.adminID = adminID;
        this.name = name;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public int getAdminID() {
        return adminID;
    }

    public void setAdminID(int adminID) {
        this.adminID = adminID;
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
}
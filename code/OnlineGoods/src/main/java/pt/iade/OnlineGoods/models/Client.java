package pt.iade.OnlineGoods.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client extends User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "client_id")
    private int clientID;

    public Client(int userID, String name, String email, double phone, int clientID) {
        super(userID, name, email, phone);
        this.clientID = clientID;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

}
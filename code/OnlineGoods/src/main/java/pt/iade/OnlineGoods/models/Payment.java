package pt.iade.OnlineGoods.models;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "payment_id")
    private int paymentID;
    @Column(name = "payment_creditcardnumber")
    private int creditcardnumber;
    @Column(name = "payment_cvc")
    private int cvc;
    @Column(name = "payment_validdate")
    private Date validdate;
    @Column(name = "payment_date")
    private Date date;

    public Payment() {
    }

    public Payment(int paymentID, int creditcardnumber, int cvc, Date validdate, Date date) {
        this.paymentID = paymentID;
        this.creditcardnumber = creditcardnumber;
        this.cvc = cvc;
        this.validdate = validdate;
        this.date = date;
    }

    public int getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    public int getCreditcardnumber() {
        return creditcardnumber;
    }

    public void setCreditcardnumber(int creditcardnumber) {
        this.creditcardnumber = creditcardnumber;
    }

    public int getCvc() {
        return cvc;
    }

    public void setCvc(int cvc) {
        this.cvc = cvc;
    }

    public Date getValiddate() {
        return validdate;
    }

    public void setValiddate(Date validdate) {
        this.validdate = validdate;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}

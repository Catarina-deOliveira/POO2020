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

    @Column(name = "pagamento_id")
    private int pagamentoID;
    @Column(name = "pagamento_creditcardnumber")
    private int creditcardnumber;
    @Column(name = "pagamento_cvc")
    private int cvc;
    @Column(name = "pagamento_datavalidade")
    private Date datavalidade;
    @Column(name = "pagamento_date")
    private Date date;

    public Payment() {
    }

    public Payment(int pagamentoID, int creditcardnumber, int cvc, Date datavalidade, Date date) {
        this.pagamentoID = pagamentoID;
        this.creditcardnumber = creditcardnumber;
        this.cvc = cvc;
        this.datavalidade = datavalidade;
        this.date = date;
    }

    public int getPagamentoID() {
        return pagamentoID;
    }

    public void setPagamentoID(int pagamentoID) {
        this.pagamentoID = pagamentoID;
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

    public Date getDatavalidade() {
        return datavalidade;
    }

    public void setDatavalidade(Date datavalidade) {
        this.datavalidade = datavalidade;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}

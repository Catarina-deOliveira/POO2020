package pt.iade.OnlineGoods.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "encomenda")
public class Package {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "encomenda_id")
    private int encomendaID;
    @Column(name = "encomenda_reference")
    private int reference;
    @Column(name = "encomenda_producto_id")
    private int encomenda_productoID;
    @Column(name = "encomenda_pagamento_id")
    private int encomenda_pagamentoID;
    @Column(name = "encomenda_cliente_id")
    private int encomenda_clienteID;

    public Package() {
    }

    public Package(int encomendaID, int reference, int encomenda_productoID, int encomenda_pagamentoID,
            int encomenda_clienteID) {
        this.encomendaID = encomendaID;
        this.reference = reference;
        this.encomenda_productoID = encomenda_productoID;
        this.encomenda_pagamentoID = encomenda_pagamentoID;
        this.encomenda_clienteID = encomenda_clienteID;
    }

    public int getEncomendaID() {
        return encomendaID;
    }

    public void setEncomendaID(int encomendaID) {
        this.encomendaID = encomendaID;
    }

    public int getReference() {
        return reference;
    }

    public void setReference(int reference) {
        this.reference = reference;
    }

    public int getEncomenda_productoID() {
        return encomenda_productoID;
    }

    public void setEncomenda_productoID(int encomenda_productoID) {
        this.encomenda_productoID = encomenda_productoID;
    }

    public int getEncomenda_pagamentoID() {
        return encomenda_pagamentoID;
    }

    public void setEncomenda_pagamentoID(int encomenda_pagamentoID) {
        this.encomenda_pagamentoID = encomenda_pagamentoID;
    }

    public int getEncomenda_clienteID() {
        return encomenda_clienteID;
    }

    public void setEncomenda_clienteID(int encomenda_clienteID) {
        this.encomenda_clienteID = encomenda_clienteID;
    }

}

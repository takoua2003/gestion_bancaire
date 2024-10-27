package org.example;
import java.util.Date;
public class Transaction {
    String typeTransaction;
    double montant;
    private Date date;
    public Transaction(String typeTransaction, double montant, Date date) {
        this.typeTransaction = typeTransaction;
        this.montant = montant;
        this.date = date;
    }

    public String getTypeTransaction() {
        return typeTransaction;
    }

    public void setTypeTransaction(String typeTransaction) {
        this.typeTransaction = typeTransaction;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}


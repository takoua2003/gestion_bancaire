package org.example;
import java.util.ArrayList;
public class CompteBancaire implements operable {
    private Integer numeroCompte;
    private double solde;
    private TitulaireCompte titulaire;
    private ArrayList<Transaction> transactions;

    public CompteBancaire(int numeroCompte, double solde, TitulaireCompte titulaire) {
        this.numeroCompte = numeroCompte;
        this.solde = solde;
        this.titulaire = titulaire;
        this.transactions = new ArrayList<>();
    }

    public Integer getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(Integer numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public TitulaireCompte getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(TitulaireCompte titulaire) {
        this.titulaire = titulaire;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }
@Override
    public void deposer(double montant) {
        solde += montant;
        transactions.add(new Transaction("Dépôt", montant, new java.util.Date()));
        System.out.println("Déposer un montant : " + montant);
    }
    @Override
    public void retirer(double montant) {
        if (montant <= solde) {
            solde -= montant;
            transactions.add(new Transaction("Retrait", montant, new java.util.Date()));
            System.out.println("Retirer un montant : " + montant);
        } else {
            System.out.println("Solde insuffisant pour effectuer le retrait.");
        }
    }
    }
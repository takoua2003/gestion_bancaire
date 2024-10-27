package org.example;
public class Main {
    public static void main(String[] args) {
        TitulaireCompte titulaireCompte = new TitulaireCompte("takwa","sadki","manzel bourguiba");
        CompteBancaire comptebancaire = new CompteBancaire(1, 1000, titulaireCompte);

        comptebancaire.deposer(500);
        comptebancaire.retirer(200);

        System.out.println("Solde : " + comptebancaire.getSolde());
    }
    }
package org.example;

public class TitulairePhysique extends TitulaireCompte {
    private String numeroIdentification;
    public TitulairePhysique(String nom, String prenom, String  adresse, String numeroIdentification) {
        super(nom, prenom, adresse);
        this.numeroIdentification = numeroIdentification;
    }
    public String getNumeroIdentification() {
        return numeroIdentification;
    }
    public void setNumeroIdentification(String numeroIdentification) {
        this.numeroIdentification = numeroIdentification;
    }
}


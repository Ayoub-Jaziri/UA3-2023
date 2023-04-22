package entities;

import java.io.Serializable;

public class Etudiant implements Serializable {


    private static final long serialVersionUID = 1L;
    public Etudiant(String numroEtudiant, String nom, String prenom) {
        this.numEtudiant=numroEtudiant;
        this.nom=nom;
        this.prenom=prenom;
    }

    public String getNumEtudiant() {
        return numEtudiant;
    }

    public void setNumEtudiant(String numEtudiant) {
        this.numEtudiant = numEtudiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "numEtudiant='" + numEtudiant + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }

    private String numEtudiant;
    private String nom;
    private String prenom;
}

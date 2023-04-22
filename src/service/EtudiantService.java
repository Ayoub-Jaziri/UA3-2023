package service;

import entities.Etudiant;

import java.io.*;

public class EtudiantService extends CommonService{
    /**
     *
     * @throws IOException IOException
     * @throws ClassNotFoundException ClassNotFoundException
     */
    public void ajouterEtudiant() throws IOException, ClassNotFoundException {

        System.out.println("veuillez saisir le numéro d'étudiant  !");
        String numroEtudiant = readInput();
        if(checkDuplicate(numroEtudiant)){
            System.out.println("étudiant déja inscrit  !");
            return;
        }
        System.out.println("veuillez saisir le nom d'étudiant  !");
        String nom = readInput();

        System.out.println("veuillez saisir le prenom d'étudiant  !");
        String prenom = readInput();

        FileOutputStream file = new FileOutputStream(new File(numroEtudiant + ".txt"));
        ObjectOutputStream o = new ObjectOutputStream(file);

        Etudiant etudiant = new Etudiant(numroEtudiant, nom, prenom);
        // Write etudiant to file
        o.writeObject(etudiant);

        o.close();
        file.close();

    }

    /**
     *
     * @throws IOException  IOException
     * @throws ClassNotFoundException   ClassNotFoundException
     */

    public void aficherEtudiant() throws IOException, ClassNotFoundException {
        System.out.println("veuillez saisir le numéro d'étudiant  !");
        String numroEtudiant = readInput();

        FileInputStream fi = new FileInputStream(new File(numroEtudiant + ".txt"));
        ObjectInputStream oi = new ObjectInputStream(fi);

        // Read objects
        Etudiant etudiant = (Etudiant) oi.readObject();

        System.out.println(etudiant.toString());

        oi.close();
        fi.close();
    }


}

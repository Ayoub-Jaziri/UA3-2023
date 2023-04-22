package service;

import entities.Cours;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CoursService extends CommonService {

    /**
     *
     * @throws IOException IOException
     * @throws ClassNotFoundException ClassNotFoundException
     */
    public void ajouterMatiere() throws IOException, ClassNotFoundException {

        System.out.println("veuillez saisir le numéro de Cours  !");
        String numCours = readInput();
        if (checkDuplicate(numCours + "-cours")) {
            System.out.println("cours déja inscrit  !");
            return;
        }
        System.out.println("veuillez saisir le code du cours  !");
        String code = readInput();

        System.out.println("veuillez saisir le titre du cours  !");
        String titre = readInput();

        FileOutputStream file = new FileOutputStream(new File(numCours + "-cours.txt"));
        ObjectOutputStream o = new ObjectOutputStream(file);

        Cours coursService = new Cours(numCours, code, titre);
        // Write cours to file
        o.writeObject(coursService);

        o.close();
        file.close();

    }


}

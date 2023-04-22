package service;

import entities.Note;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;

public class NotesService extends CommonService {

    /**
     * @throws IOException IOException
     */
    public void setNote() throws IOException, ClassNotFoundException {

        System.out.println("veuillez saisir le numéro de Cours  !");
        String numCours = readInput();
        if (!checkDuplicate(numCours + "-cours")) {
            System.out.println("numCours n'existe pas  !");
            return;
        }

        System.out.println("veuillez saisir le num Etudiant  !");
        String numEtudiant = readInput();
        if (!checkDuplicate(numEtudiant)) {
            System.out.println("numEtudiant n'existe pas  !");
            return;
        }


        System.out.println("veuillez saisir Note  !");
        BigDecimal note;
        try {
            note = new BigDecimal(readInput());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }


        FileOutputStream file = new FileOutputStream(new File(numCours + "-notes.txt"));
        ObjectOutputStream o = new ObjectOutputStream(file);

        Note noteClass = new Note(numCours, numEtudiant, note);
        // Write Note to file
        o.writeObject(noteClass);

        o.close();
        file.close();

    }


}

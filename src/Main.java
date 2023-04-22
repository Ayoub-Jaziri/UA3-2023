import service.CoursService;
import service.EtudiantService;
import service.NotesService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        EtudiantService etudiantService = new EtudiantService();
        CoursService coursService = new CoursService();
        NotesService notesService = new NotesService();
        String newLine = System.getProperty("line.separator");
        System.out.println("Bonjour!");
        String input = "0";
        do {
            System.out.println("pour ajouter un etudiant veuillez saisir 1 !"
                    + newLine + " pour ajouter une Cours  veuillez saisir 2!"
                    + newLine + " pour ajouter une note  veuillez saisir 3!"
                    + newLine + " pour afficher un etudiant  veuillez saisir 4!"
                    + newLine + " pour afficher un etudiant veuillez saisir son numéro!"
                    + newLine + " pour quitter taper 0");
            // Enter data using BufferReader
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            // Reading data using readLine
            input = reader.readLine();
            switch (input) {
                case "1":
                    etudiantService.ajouterEtudiant();
                    break;
                case "2":
                    coursService.ajouterMatiere();
                    break;
                case "3":
                    notesService.setNote();
                case "4":
                    etudiantService.aficherEtudiant();
                    break;
                default:
                    break;
            }
        } while (!"0".equals(input));
        System.out.println("Good Bye");
    }
}
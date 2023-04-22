package entities;

import java.io.Serializable;
import java.math.BigDecimal;

public class Note  implements Serializable {
    private String  numCours;
    private String numEtudiant;
    private BigDecimal note;

    private static final long serialVersionUID = 1L;
    public Note(String numCours, String numEtudiant, BigDecimal note) {
        this.numCours = numCours;
        this.numEtudiant = numEtudiant;
        this.note = note;
    }

    public String getNumCours() {
        return numCours;
    }

    public void setNumCours(String numCours) {
        this.numCours = numCours;
    }

    public String getNumEtudiant() {
        return numEtudiant;
    }

    public void setNumEtudiant(String numEtudiant) {
        this.numEtudiant = numEtudiant;
    }

    public BigDecimal getNote() {
        return note;
    }

    public void setNote(BigDecimal note) {
        this.note = note;
    }




    @Override
    public String toString() {
        return "Note{" +
                "numCours='" + numCours + '\'' +
                ", numEtudiant='" + numEtudiant + '\'' +
                ", note=" + note +
                '}';
    }
}

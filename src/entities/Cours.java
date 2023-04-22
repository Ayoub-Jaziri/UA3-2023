package entities;

import java.io.Serializable;

public class Cours  implements Serializable {

    private String  numCours;
    private String code;
    private String titre;


    private static final long serialVersionUID = 1L;
    public Cours(String numCours, String code, String titre) {
        this.numCours = numCours;
        this.code = code;
        this.titre = titre;
    }

    public String getNumCours() {
        return numCours;
    }


    public void setNumCours(String numCours) {
        this.numCours = numCours;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }




    @Override
    public String toString() {
        return "Cours{" +
                "numCours='" + numCours + '\'' +
                ", code='" + code + '\'' +
                ", titre='" + titre + '\'' +
                '}';
    }
}

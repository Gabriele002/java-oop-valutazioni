package org.lessons.java.valutazioni;

import java.util.Random;

public class Studente {
    //ATTRIBUTI
    int idStudent;
    int perAssenza;
    double mediaVoti;


    //COSTRUTTORE
    public Studente(int idStudent, int perAssenza, double mediaVoti) {
        this.idStudent = idStudent;
        this.perAssenza = perAssenza;
        this.mediaVoti = mediaVoti;
    }

    //METODI
    public void id() {
        Random random = new Random();
        int numStudenti = random.nextInt(20 - 10 + 1) + 10;
    }

    public boolean promosso() {
        if (perAssenza > 50) {
            return false;
        } else if (perAssenza >= 25 && perAssenza <= 50) {
            if (mediaVoti > 2) {
                return true;
            } else {
                return false;
            }
        } else {
            if (mediaVoti >= 2) {
                return true;
            } else {
                return false;
            }
        }
    }

    @Override
    public String toString() {
        return "Id Student= " + idStudent + "\n" +
                "Assenza totali= " + perAssenza + "\n" +
                "Media voti= " + mediaVoti + "\n" +
                (promosso() ? " Promosso" : " Bocciato") + "\n" ;
    }
}

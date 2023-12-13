package org.lessons.java.valutazioni;


import java.util.ArrayList;

public class Classe extends Studente{
    //ATTRIBUTI
    ArrayList<Studente> studenti = new ArrayList<>();
    // COSTRUTTORI
    public Classe(int idStudent, int perAssenza, double mediaVoti, ArrayList<Studente> studenti) {
        super(idStudent, perAssenza, mediaVoti);
        this.studenti = studenti;
    }
    //GETTER E SETTER

    public ArrayList<Studente> getStudenti() {
        return studenti;
    }

    public void setStudenti(ArrayList<Studente> studenti) {
        this.studenti = studenti;
    }
}

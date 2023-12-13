package org.lessons.java.valutazioni;


import java.util.ArrayList;

public class Corso {
    //ATTRIBUTI
    ArrayList<Studente> studenti = new ArrayList<>();
    // COSTRUTTORI
    public Corso() {
    }
    public Corso( ArrayList<Studente> studenti) {
        this.studenti = studenti;
    }
    //GETTER E SETTER
    public ArrayList<Studente> getStudenti() {
        return studenti;
    }
    public void setStudenti(ArrayList<Studente> studenti) {
        this.studenti = studenti;
    }

    //METODI
    public void aggiungiStudente(Studente studente) {
        if (!studenti.contains(studente)) {
            studenti.add(studente);
        } else {
            System.out.println("Studente gia' presente nella lista");
        }
    }

    public void rimuoviStudente(Studente studente) {
        if (studenti.contains(studente)) {
            studenti.remove(studente);
        } else {
            System.out.println("Lo studente che vuoi rimuovere non esiste");
        }
    }
    public int numeroPromossi() {
        int contatore = 0;
        for (int i = 0; i < studenti.size(); i++) {
            Studente student = studenti.get(i);
            if (student.promosso()) {
                contatore++;
            }
        }
        return contatore;
    }

    public int numeroBocciati() {
        int contatore = 0;
        for (int i = 0; i < studenti.size(); i++) {
            Studente student = studenti.get(i);
            if (!student.promosso()) {
                contatore++;
            }
        }
        return contatore;
    }

    public int percentualeBocciati() {
        int promossi = numeroBocciati();
        return (promossi * 100) / studenti.size();
    }

    public int percentualePromossi() {
        int promossi = numeroPromossi();
        return (promossi * 100) / studenti.size();
    }


    @Override
    public String toString() {
        return "Corso jaita99: " + "\n"
                + studenti;
    }
}

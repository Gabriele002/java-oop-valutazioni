package org.lessons.java.valutazioni;

import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Corso jaita99 = new Corso();
        Random random = new Random();
        int numStudenti = random.nextInt(20 - 10 + 1) + 10;

        for (int i = 0; i < numStudenti; i++) {
           IdStudent idStudent = new IdStudent();
           Studente studente = new Studente(idStudent.getId(), random.nextInt(0,101), random.nextInt(0,6));
           jaita99.aggiungiStudente(studente);
        }

        System.out.println(jaita99);
    }

}

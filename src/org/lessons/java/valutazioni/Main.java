package org.lessons.java.valutazioni;

import java.util.ArrayList;
import java.util.Random;

public class Corso {
    public static void main(String[] args) {
        Random random = new Random();
        int numStudenti = random.nextInt(20 - 10 + 1) + 10;

        for (int i = 0; i < numStudenti; i++) {
           IdStudent idStudent = new IdStudent();
           Studente studente = new Studente(idStudent.getId(), 20, random.nextInt(0,6));
           System.out.println(studente.valutazione());




        }
    }
}

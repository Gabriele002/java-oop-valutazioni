package org.lessons.java.valutazioni;

public class IdStudent {
        private static int counter = 1000;

    //ATTRIBUTI
        private int id;
        public IdStudent(){
            id = counter++;
        }
    //GET E SETTER
        public final int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
        //METODI

    @Override
    public String toString() {
        return "IdStudent" +
                "id=" + id;
    }
}


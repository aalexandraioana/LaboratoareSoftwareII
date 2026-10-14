package org.example;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String nume;
    private String grupa;
    private List<Integer> note;

    public Student(String valoare, String grupa){
        this.nume = valoare;
        this.grupa = grupa;
        note = new ArrayList();
    }
    public String getNume() {
        return nume;
    }
    public String getGrupa() {
        return grupa;
    }
    public void adaugaNota(int nota){
        note.add(nota);
    }
    public boolean esteIntegralist(){
        boolean integralist = true;
        for(Integer nota : note)
        {
            if (nota < 5)
                integralist = false;
        }
        return integralist;
    }
    public Integer medie(){
    return average;
    }
}

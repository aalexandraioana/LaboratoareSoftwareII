package lab;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String nume;
    private String prenume;
    private String grupa;
    private List<Integer> note;

    public Student(String nume, String prenume, String grupa){
        this.nume = nume;
        this.prenume = prenume;
        this.grupa = grupa;
        note = new ArrayList();
    }
    public String getNume() {
        return nume;
    }
    public String getPrenume() {
        return prenume;
    }
    public String getGrupa() {
        return grupa;
    }
    public void adaugaNota(int nota){
        note.add(nota);
    }
    public void afiseazaStudent()
    {
        System.out.print("Nume: " + this.nume + " | Prenume: " + this.prenume + " | Grupa: " + this.grupa + " cu urmatoarele note: " );
        for(Integer nota : this.note)
        {
            System.out.print(nota + " ");
        }
        System.out.println();
        System.out.println("Media studentului este: " + medie());
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
    public double medie() {
        double sum = 0;
        int n = note.size();
        for(Integer nota : note)
        {
            sum += (double)nota;
        }
    return sum / (double)n;
    }

    public int numarRestante() {
        int count = 0;
        for (int n : note) {
            if (n < 5) {
                count++;
            }
        }
        return count;
    }
}

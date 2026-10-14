package lab;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static List<Integer> generateRandomIntegerList(List<Integer> list, int size, int origin, int bound)
    {
        int r;
        for (int i = 0; i < size; i++) {
            Random rand = new Random();
            r = rand.nextInt(origin, bound);
            list.add(r);
        }

        return list;
    }
    static void main() {

        System.out.println("Aplicatia 1");

        List<Integer> x = new ArrayList();
        List<Integer> y = new ArrayList();
        List<Integer> xPlusY = new ArrayList();
        Set<Integer> zSet = new TreeSet();
        List<Integer> xMinusY = new ArrayList();
        int p = 4;
        List<Integer> xPlusYLimitedByP = new ArrayList();

        generateRandomIntegerList(x, 5, 0, 11);
        Collections.sort(x);

        System.out.print("List x: ");
        for (Integer i : x) {
            System.out.print(i + " ");
        }

        System.out.println();

        generateRandomIntegerList(y, 7, 0, 11);
        Collections.sort(y);

        System.out.print("List y: ");
        for (Integer i : y) {
            System.out.print(i + " ");
        }


        System.out.println();

        xPlusY.addAll(x);
        xPlusY.addAll(y);
        Collections.sort(xPlusY);

        System.out.print("List xPlusY: ");
        for (Integer i : xPlusY) {
            System.out.print(i + " ");
        }

        System.out.println();

        zSet.addAll(x);
        zSet.retainAll(y);

        System.out.print("Set zSet: ");
        for (Integer i : zSet) {
            System.out.print(i + " ");
        }

        System.out.println();

        xMinusY.addAll(x);
        xMinusY.removeAll(zSet);
        Collections.sort(xMinusY);

        System.out.print("List xMinusY: ");
        for (Integer i : xMinusY) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (Integer i : xPlusY) {
            if (i <= p)
                xPlusYLimitedByP.add(i);
        }
        Collections.sort(xPlusYLimitedByP);

        System.out.print("List xPlusYLimitedByP: ");
        for (Integer i : xPlusYLimitedByP) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println("Aplicatia 2");

        List<Student> studenti = new ArrayList<>();
        studenti.add(new Student("Popescu", "Marian", "225_3"));
        studenti.add(new Student("Popescu", "Maria", "225_3"));
        studenti.add(new Student("Popa", "Marian", "225_3"));
        studenti.add(new Student("Bica", "Irina", "225_3"));
        studenti.add(new Student("Badea", "Ion", "225_1"));
        studenti.add(new Student("Cacoveanu", "Andreea", "225_1"));
        studenti.add(new Student("Onofrei", "Mircea", "225_1"));

        for (Student s : studenti) {
            List<Integer> note = generateRandomIntegerList(new ArrayList<>(), 5, 4, 11);
            for (int nota : note) {
                s.adaugaNota(nota);
            }
        }

        Collections.sort(studenti, new ByGroupFirstComparator());
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Studenti in ordine alfabetica dupa grupe: ");

        for (Student s : studenti)
        {
            s.afiseazaStudent();
        }

        List<Student> integralisti = new ArrayList<>();
        List<Student> restantieri = new ArrayList<>();

        for (Student s : studenti)
        {
            if(s.esteIntegralist())
                integralisti.add(s);
            else
                restantieri.add(s);
        }

        Collections.sort(integralisti, new ByGradesComparator());

        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Studenti integralisti in ordinea descrescatoare a notelor obtinute: ");

        for (Student s : integralisti)
        {
            s.afiseazaStudent();
        }

        Collections.sort(restantieri, new ByFailsComparator());

        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Studenti restantieri in ordinea crescatoare a numarului de restante: ");

        for (Student s : restantieri)
        {
            s.afiseazaStudent();
        }
    }
}


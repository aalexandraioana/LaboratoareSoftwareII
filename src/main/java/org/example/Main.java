package org.example;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    List<Integer> generateRandomFrom0To10(List<Integer> list, int size)
    {
        int r;
        for (int i = 0; i < size; i++) {
            Random rand = new Random();
            r = rand.nextInt(0, 10);
            list.add(r);
        }

        return list;
    }
    void main() {
        List<Integer> x = new ArrayList();
        List<Integer> y = new ArrayList();
        List<Integer> xPlusY = new ArrayList();
        Set<Integer> zSet = new TreeSet();
        List<Integer> xMinusY = new ArrayList();
        int p = 4;
        List<Integer> xPlusYLimitedByP = new ArrayList();

        generateRandomFrom0To10(x, 5);
        Collections.sort(x);

        System.out.print("List x: ");
        for (Integer i : x) {
            System.out.print(i + " ");
        }

        System.out.println();

        generateRandomFrom0To10(y, 7);
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
    }
}


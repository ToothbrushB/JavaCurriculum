package com.calebli.tutorial;

public class Variables {
    public static void main(String[] args) {
        int a; // variable of type integer named a
        a = 1; // assign a value of 1 to "a"

        int b = 1; // assign and declare int b with a value of 1

        int x = 3;
        x *= 2; // x is now 6

        int c = 5;
        int d = 3;
        d = ++c; // d = 6, c = 6; add one to c and use the new value of c

        int e = 5;
        int f = 3;
        f = e++; // f = 5, e = 6; add one to e and use the old value of e

        int numCorn = 10;
        double percentCornLeft = 5.5;
        double originalNumCorn = (100 / percentCornLeft) * numCorn;

        short myShort;
        myShort = 10;
        int myInt = -28;
        myShort = 0;
        myInt = 53;

        int unitNum = 1;
        byte questionPoints;
        questionPoints = 3;
        float quizPoints = 0;
        quizPoints += questionPoints;
        quizPoints += 20;
        boolean quizWorthManyPoints = quizPoints >= 20;
        boolean questionWorthManyPoints = questionPoints >= 5;


    }
}

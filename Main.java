package com.company;

public class Main {

    public static void main ( String[] args ) {

        ATC atc = new ATC ();

        Operator operator1 = new Operator ("Матвей", atc);
        Operator operator2 = new Operator ("Никола", atc);
        Operator operator3 = new Operator ("Грозный", atc);

        atc.start ();

        operator1.start ();
        operator2.start ();
        operator3.start ();
    }
}

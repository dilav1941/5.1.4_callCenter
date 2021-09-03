package com.company;

// работы операторского отдела
public class Operator extends Thread {
    private final int PROCESSING_TIME = 3000;
    private ATC atc;

    public Operator(String name, ATC atc) {
        super(name);
        this.atc =  atc;
    }

    @Override
    public void run() {
        while (atc.isAlive ()) {
            try {
                System.out.printf ("Оператор %s обрабатывает звонок %s \n",
                        Thread.currentThread ().getName (),
                        atc.getCallsQueue ().poll ());
                Thread.sleep (PROCESSING_TIME);
                System.out.printf ("%s обработал звонок \n",
                        Thread.currentThread ().getName ());
            }
            catch (InterruptedException e) {
                e.printStackTrace ();
            }
        }
        System.out.printf ("У %s звонков нет \n",
                Thread.currentThread ().getName ());
    }
}

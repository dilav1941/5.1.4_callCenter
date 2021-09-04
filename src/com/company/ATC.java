package com.company;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

// работа станции АТС
public class ATC extends Thread {
    private BlockingDeque<String> callsQueue = new LinkedBlockingDeque<> ();
    private final int CALLS_AMOUNT = 10;
    private final int CALL_TIME = 1000;

    public BlockingDeque<String> getCallsQueue () {
        return callsQueue;
    }

    @Override
    public void run () {
        try {
            for (int i = 0; i < CALLS_AMOUNT; i++) {
                System.out.println ("Входящий звонок " + i);
                getCallsQueue ().put ("Входящий звонок " + i);
                Thread.sleep (CALL_TIME);
            }
        } catch (InterruptedException e) {
            System.out.println (e.getMessage ());
        }
    }
}

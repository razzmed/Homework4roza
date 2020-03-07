package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        for (int i = 1; i < 6; i++) {
            Runner r = new Runner("Runner " + i);
            r.setRunnerName(i +1);
            r.setNumber(0);
            r.start();
            r.join();
        }
        for (int i = 5; i > 1; i--) {
            Runner rBack = new Runner("Runner " + i);
            rBack.setRunnerReturn(i - 1);
            rBack.setNumber(1);
            rBack.start();
            rBack.join();
        }
        System.out.println("Runner 1 берет палочку" );


    }
}

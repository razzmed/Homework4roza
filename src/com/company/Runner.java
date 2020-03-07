package com.company;

public class Runner extends Thread {


    public Runner(String name) {
        super(name);
    }

    private int runnerName;
    private int runnerReturn;
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getRunnerName() {
        return runnerName;
    }

    public void setRunnerName(int runnerName) {
        this.runnerName = runnerName;
    }

    public int getRunnerReturn() {
        return runnerReturn;
    }

    public void setRunnerReturn(int runnerReturn) {
        this.runnerReturn = runnerReturn;
    }

    public void run() {
        try {
            if (getNumber() == 0) {
                if (getRunnerName() == 6) {
                    System.out.println(this.getName() + " берет палочку");
                    System.out.println(this.getName() + " бежит к финишу");
                } else {
                    System.out.println(this.getName() + " берет палочку");
                    System.out.println(this.getName() + " бежит к Runner " + getRunnerName());
                }
            } else {
                if (getRunnerReturn() < 4) {
                    System.out.println(this.getName() + " берет палочку");
                    System.out.println(this.getName() + " бежит к Runner " + getRunnerReturn());
                }else {
                    System.out.println(this.getName() + " бежит к Runner " + getRunnerReturn());
                }
            }
            sleep(4000);
        } catch (InterruptedException e) {

        }

    }
}
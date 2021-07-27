package com.Alzakhar.Lesson3.PingPongGame;

public class PingPongActions {

    boolean isPinged = false;

    public synchronized void ping() {
        while (isPinged) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Ping");
        isPinged = true;
        notify();
    }

    public synchronized void pong() {
        while (!isPinged) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Pong");
        isPinged = false;
        notify();
    }
}

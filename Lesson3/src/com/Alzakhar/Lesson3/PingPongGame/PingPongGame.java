package com.Alzakhar.Lesson3.PingPongGame;

public class PingPongGame {
    public static void main(String[] args) {
        PingPongActions pingPongActions = new PingPongActions();
        Thread player1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    pingPongActions.ping();
                }
            }
        });

        Thread player2 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    pingPongActions.pong();
                }
            }
        });

        player1.start();
        player2.start();
    }
}

package com.slinger.docker;

public class HelloWorldPing {

    public static void main(String[] args) throws Exception {

        for(int i = 0; i < 100; i++) {
            System.out.println("Hello world Ping: " + i);
            Thread.sleep(1000);
        }
    }
}

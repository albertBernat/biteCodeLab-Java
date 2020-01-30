package com.ttpsc.bitecodelab.records;

public class Main {
    public static void main(String[] args) {
        Playground playground = new Playground("abc", "cba");
        playground.name();
        System.out.println(playground.whatsUp());
        System.out.println(playground);
    }
}

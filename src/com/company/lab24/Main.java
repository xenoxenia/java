package com.company.lab24;

public class Main {
    public static void main(String[] args) {
        ChairFactory chairFactory = new ChairFactory();
        Client client = new Client();
        client.setChair(chairFactory.createMagicChair("wood"));
        client.sit();
    }
}

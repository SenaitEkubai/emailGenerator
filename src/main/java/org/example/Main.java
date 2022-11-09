package org.example;

public class Main {


    public static void main(String[] args) {
        EmailGenerator emailGenerated = new EmailGenerator("hellen", "Berhe");
        emailGenerated.setEmailCapacity(200);
        System.out.println( emailGenerated.printAll());;

    }
}
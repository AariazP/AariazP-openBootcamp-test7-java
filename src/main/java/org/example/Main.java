package org.example;

public class Main {
    public static void main(String[] args) {

        String[] names = {"John", "Jane", "Joe", "Jill"};
        StringBuilder nameToString = new StringBuilder();
        for (String name : names) {
            nameToString.append(name).append(" ");
        }
        System.out.println(nameToString);

    }
}
package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello someone!");
        Sum.printOdin();
    }
    public class Sum {
        public static int odin = 1;
        public static void printOdin() {
            System.out.println(odin);
        }
    }

}
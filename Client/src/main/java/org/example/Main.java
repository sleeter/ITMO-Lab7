package org.example;

import static org.example.Main.Product.productMaker;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello someone!");
        productMaker(7, 9);
    }
    public class Product {
        public static void productMaker(int a, int b){
            System.out.println(a * b);
        }
    }
}
package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int score = 2;
            if (score > 5) {
                System.out.println("More than 5");
            }else{
                System.out.println("Less than 5");
            }

        int a;
        int b;
        Scanner ma = new Scanner(System.in);
        System.out.println("enter a");
        a = ma.nextInt();
        System.out.println("enter b");
        b = ma.nextInt();
        if (a>b) {
            System.out.println("a more than b");
        } else if (a == b) {
            System.out.println("a equal b");
        } else {
            System.out.println("b more than a");
        }
    }
}

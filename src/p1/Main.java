package p1;

/*
 * Advanced String Manipulation Demo
 * CSC 164-402
 * Uros Vorkapic
 * Feb 18, '16
 * Version 0.1
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence;

        do {
            sentence = input.next();
            System.out.println(sentence);
        } while (sentence .equals(""));
    }
}

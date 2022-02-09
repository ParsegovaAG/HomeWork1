package com.company;

public class Alphabet {

    public static char[] createAlphabet(){
        char[] alphabet = new char[26];
        for (int i = 0; i < 26; i++){
            alphabet[i] = (char)(97 + i);
        }
        return alphabet;
    }

    public static void printAlphabet(char[] alphabet) {
        /* WRITE CODE HERE */
        for (char c : alphabet) {
            System.out.print(c);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        System.out.println("Печатаем алфавит в прямом порядке");
        printAlphabet(createAlphabet());
        System.out.println();
    }

    }

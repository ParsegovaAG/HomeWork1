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
        for (int i = 0; i < alphabet.length; i++){
            System.out.print(alphabet[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        System.out.println("Печатаем алфавит в прямом порядке");
        printAlphabet(createAlphabet());
        System.out.println();
    }

    }

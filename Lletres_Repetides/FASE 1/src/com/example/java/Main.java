package com.example.java;

public class Main {

    public static void main(String[] args) {
        // Método 1
        char [] charArray = {'I','s','m','a','e','l'};
        int len=charArray.length;
        for (int i=0; i < len ; i++){
            System.out.println("Letra "+i+": "+charArray[i]);
        }
        // Método 2
        for (char c:charArray){
            System.out.println(c);
        }
        // Método 3
        int i=0;
        while (i<len){
            System.out.println("Letra "+i+": "+charArray[i]);
            i++;
        }
    }
}

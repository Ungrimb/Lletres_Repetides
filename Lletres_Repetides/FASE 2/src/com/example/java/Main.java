package com.example.java;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String b;
        char a;
        List<Character> charList = new ArrayList();
            charList.add('I');
            charList.add('s');
            charList.add('m');
            charList.add('a');
            charList.add('e');
            charList.add('l');
            charList.add('1');

        int len=charList.size();
        for (int i=0; i < len ; i++){
            a=Character.toLowerCase(charList.get(i));
            if (!Character.isDigit(a)) {
                if (a!='a' && a!='e' && a!='i' && a!='o' && a!='u'){
                    b="CONSONANT";
                } else {
                    b="VOCAL";
                }
                System.out.println("Letra "+i+": "+charList.get(i)+"  "+b);
            } else {
                System.out.println("Els noms de persones no contenen números!");
            }
        }
    }
}

package com.example.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Character> name = new ArrayList<>(Arrays.asList('I','s','m','a','e','l'));

        List<Character> surname = new ArrayList<>(Arrays.asList('A','n','a','y','a'));

        List<Character> Fullname = new ArrayList<>();

        Fullname.addAll(name);
        Fullname.add(' ');
        Fullname.addAll(surname);

        System.out.println(Fullname);
    }
}

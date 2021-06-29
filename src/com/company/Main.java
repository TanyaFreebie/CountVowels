package com.company;

public class Main {

    public static void main(String[] args) {

        int vCount = 0;

        String word = "Apple";

        word = word.toLowerCase();

        for(int i = 0; i < word.length(); i++) {

            if(word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {

                vCount++;
             
            }

        }

        System.out.println("There are " + vCount + " vowels in word " + word);

    }
}



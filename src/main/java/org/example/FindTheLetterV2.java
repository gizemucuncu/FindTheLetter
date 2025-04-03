package org.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FindTheLetterV2 {
    public static void main(String[] args) {
        ArrayList<Character> letterList = randomLetterList(4);
        ArrayList<Character> correctGuess = new ArrayList<>();
        Scanner scanner=new Scanner(System.in);

        System.out.println("Bir harf girin");

        for (int i = 1; i <= 4; i++) {

            System.out.println(i + ". tahmin: ");
            char input = scanner.next().charAt(0);

            if (!letterList.contains(input)){
                letterList.add(input);
                System.out.println("Yanlış Tahmin !! Girilen harf listeye eklendi...");
            } else {

                System.out.println("Doğru Tahmin!!");
            }
        }

        System.out.println("****** Oyun Sonucu ******");
        System.out.println("Güncellenen harf listesi: " + letterList);
    }

    public static ArrayList<Character> randomLetterList(int count){
        ArrayList<Character> letters = new ArrayList<>();
        Random random = new Random();


        while (letters.size()<count){
            char randomLetter = (char) ('a' + random.nextInt(26));
            if(!letters.contains(randomLetter)){
                letters.add(randomLetter);
            }
        }
        // System.out.println("oluşturulan liste: " +letters); // kontrol amaçlı yazdırdım
        return letters;
    }
}

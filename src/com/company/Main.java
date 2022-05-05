package com.company;

import java.util.Scanner;

public class Main {
    private static final String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";

    private static char cezar(char symbol, int shift) {
        if (alphabet.indexOf(symbol) != -1){
            return alphabet.charAt((alphabet.indexOf(symbol) + shift) % alphabet.length());
        }else{
            return symbol;
        }
    }

    public static void main(String[] args) {
        System.out.println("Введите текст : ");
        String scanner = new Scanner(System.in).nextLine();
        String text = scanner;

        text = text.toLowerCase();
        for (int i = 0; i <= 33; ++i){
            for (int j = 0; j < text.length(); ++j)
                System.out.print(cezar(text.charAt(j),i));
            System.out.println("\n" + "Смещение на " + i + " символов");
        }
        System.out.println();
    }
}

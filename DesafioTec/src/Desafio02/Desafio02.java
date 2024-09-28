package Desafio02;

import java.util.Scanner;

public class Desafio02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe uma string: ");
        String input = scanner.nextLine();

        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar == 'a' || currentChar == 'A') {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("A letra 'a' aparece " + count + " vez(es) na string.");
        } else {
            System.out.println("A letra 'a' não foi encontrada na string.");
        }

        scanner.close();
    }
}
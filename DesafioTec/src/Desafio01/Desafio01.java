package Desafio01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio01 {

    public static List<Integer> generateFibonacci(int n) {
        List<Integer> sequence = new ArrayList<>();
        sequence.add(0);
        sequence.add(1);

        while (sequence.get(sequence.size() - 1) < n) {
            int nextValue = sequence.get(sequence.size() - 1) + sequence.get(sequence.size() - 2);
            sequence.add(nextValue);
        }

        return sequence;
    }

    public static boolean isFibonacci(int n) {
        List<Integer> sequence = generateFibonacci(n);
        return sequence.contains(n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int number = scanner.nextInt();

        if (isFibonacci(number)) {
            System.out.println("O número " + number + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + number + " NÃO pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
}
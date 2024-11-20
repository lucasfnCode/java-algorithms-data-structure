package br.com.lucas.estruturadados.staticstructures.stacks.tests;

import br.com.lucas.estruturadados.staticstructures.stacks.Stack;

import java.util.Scanner;

public class DesafioPalindromo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nextLine = scanner.nextLine().toLowerCase();

        Stack<Character> palavraCrua = new Stack<>();

        for (int i = 0; i < nextLine.length(); i++) {

            if (nextLine.charAt(i) != ' ') {
                palavraCrua.pile(Character.valueOf(nextLine.charAt(i)));
            }
        }

        Stack<Character> palavraDesempilhada = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();


        while(!palavraCrua.isEmpty()) {
            Character c = palavraCrua.unStack();
            palavraDesempilhada.pile(c);
            stringBuilder.append(c);
        }

        System.out.println(palavraDesempilhada);
        System.out.println(stringBuilder);

        StringBuilder stringBuilder2 = new StringBuilder();

        while (!palavraDesempilhada.isEmpty()) {
            stringBuilder2.append(palavraDesempilhada.unStack());
        }

        System.out.println(stringBuilder.toString().equals(stringBuilder2.toString()));
    }
}

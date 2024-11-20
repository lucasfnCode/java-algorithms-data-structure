package br.com.lucas.estruturadados.staticstructures.stacks.tests;

import br.com.lucas.estruturadados.staticstructures.stacks.Stack;

public class DesafioSimbolosBalanceados {

    public static void main(String[] args) {
        String expressaoMatematica = "((A+B)+(D+E))";

        Stack<Character> stack = new Stack<>();
        Integer parentesesAEsquerda = (Integer) 0;

        for (int i = 0; i < expressaoMatematica.length(); i++) {
            Character c = (Character) expressaoMatematica.charAt(i);

            if (c == '(') {
                parentesesAEsquerda++;
            }

            stack.pile(c);
        }

        Stack<Character> unpile = new Stack<>();
        Integer parentesesADireita = (Integer) 0;

        while (!stack.isEmpty()) {
            Character c = stack.unStack();


            if (c == ')') {
                parentesesADireita++;
            }

            unpile.pile(c);
        }

        System.out.println(parentesesAEsquerda);
        System.out.println(parentesesADireita);

        boolean result = parentesesAEsquerda.equals(parentesesADireita);

        System.out.println(result);
    }
}
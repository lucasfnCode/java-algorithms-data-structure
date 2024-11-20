package br.com.lucas.estruturadados.staticstructures.stacks.tests;

import br.com.lucas.estruturadados.staticstructures.stacks.Stack;

import java.util.Random;

public class Exer01 {

    public static void main(String[] args) {
        Random random = new Random();
        Stack<Integer> objectStack = new Stack<>();

        for (int i = 0; i < 10; i++) {
            int nexted = random.nextInt(20);

            if (nexted % 2 == 0) {
                objectStack.pile(Integer.valueOf(nexted));
            } else {
                if (objectStack.isEmpty()) {
                    System.out.println("A pilha está vazia");
                }
                objectStack.unStack();
            }
        }


        while (!objectStack.isEmpty()) {
            Integer uned = objectStack.unStack();
            System.out.println("Objeto " + uned + " sendo desempilhado!");
        }
    }
}

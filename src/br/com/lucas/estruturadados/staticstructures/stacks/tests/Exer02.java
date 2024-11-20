package br.com.lucas.estruturadados.staticstructures.stacks.tests;

import br.com.lucas.estruturadados.staticstructures.stacks.Stack;

import java.util.Random;

public class Exer02 {

    public static void main(String[] args) {
        Random random = new Random();
        Stack<Integer> par = new Stack<>();
        Stack<Integer> impar = new Stack<>();

        for (int i = 0; i < 10; i++) {
            int nexted = random.nextInt(20);

            if (nexted % 2 == 0 && nexted != 0) {
                par.pile(Integer.valueOf(nexted));
            } else if (nexted == 0) {

                if (par.isEmpty()) {
                    System.out.println("Erro a pilha PAR está vazia");
                } else {
                    par.unStack();
                }

                if (impar.isEmpty()) {
                    System.out.println("Erro a pilha IMPAR está vazia");
                } else {
                    impar.unStack();
                }

            } else {
                impar.pile(Integer.valueOf(nexted));
            }
        }

        System.out.println("---------------------------------------------\n");
        System.out.println("Desempilhando pilha PAR \n");

        while (!par.isEmpty()) {
            System.out.println("Desempilhando " + par.unStack());
        }

        System.out.println("---------------------------------------------\n");
        System.out.println("Desempilhando pilha IMPAR \n");

        while (!impar.isEmpty()) {
            System.out.println("Desempilhando " + impar.unStack());
        }


    }
}

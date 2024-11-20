package br.com.lucas.estruturadados.staticstructures.stacks.tests;

import br.com.lucas.estruturadados.staticstructures.stacks.Stack;

public class DesafioConversorDecimalBinario {

    public static void main(String[] args) {

        printsResult(Integer.valueOf(100));

    }

    public static void printsResult(Integer decimal) {
        System.out.println("O decimal " + decimal + " em binário é = " + conversorDecimalBinario(decimal));
    }

    public static Stack<Integer> conversorDecimalBinario(Integer decimal) {
        Stack<Integer> empilha = new Stack<>();
        Integer decimalAuxiliary = decimal;

        while(decimalAuxiliary > 0) {
            int pile = decimalAuxiliary % 2;

            int auxiliary = Math.floorDiv(decimalAuxiliary , 2);

            empilha.pile(Integer.valueOf(pile));

            decimalAuxiliary = (Integer) auxiliary;
        }

        Stack<Integer> desempilha = new Stack<>();

        while (!empilha.isEmpty()) {
            desempilha.pile(empilha.unStack());
        }

        return desempilha;
    }

}

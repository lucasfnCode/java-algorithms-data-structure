package br.com.lucas.estruturadados.staticstructures.stacks.tests;

import br.com.lucas.estruturadados.staticstructures.stacks.Stack;

public class DesafioTorreDeHanoi {

    public static void main(String[] args) {

        // o que eu preciso ter 3 Stacks representantes das astes
        Stack<Integer> a = new Stack<>();

        Stack<Integer> b = new Stack<>();

        Stack<Integer> c = new Stack<>();

        // =========================================================
        // preencher a aste incial com os valores que representaram os discos
        a.pile(Integer.valueOf(3));
        a.pile(Integer.valueOf(2));
        a.pile(Integer.valueOf(1));


        resolution(a.size(), a, c, b);
    }

    public static void resolution(int n, Stack<Integer> original, Stack<Integer> destino, Stack<Integer> auxiliar) {

        // recurssividade
        if (n > 0) {
            resolution(n-1, original, auxiliar, destino);
            destino.pile(original.unStack());
            System.out.println("------");
            System.out.println("Original: " + original);
            System.out.println("Destino: " + destino);
            System.out.println("Aux: " + auxiliar);

            resolution(n-1, auxiliar, destino, original);
        }
    }


}

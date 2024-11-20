package br.com.lucas.estruturadados.staticstructures.arrays.tests;

import br.com.lucas.estruturadados.staticstructures.arrays.Vetor;

public class TestList {

    public static void main(String[] args) {

        Vetor<String> testeDois = new Vetor<>(10);

        testeDois.put("ELis");
        testeDois.put("Lucas");
        testeDois.put("Camila");
        testeDois.put("ELis");

        System.out.println(testeDois.contains("Lucas"));
        System.out.println(testeDois.remove("ELis"));
        System.out.println(testeDois.remove("Lucas"));
        System.out.println(testeDois);
    }
}

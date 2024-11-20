package br.com.lucas.estruturadados.staticstructures.queue.tests;

import br.com.lucas.estruturadados.staticstructures.queue.Queue;

import java.util.Random;

public class Exer03_BatataQuente {

    public static void main(String[] args) {

        Random hot = new Random();

        potatoGameHot(hot.nextInt(10));

    }

    public static void potatoGameHot(int hot) {
        Queue<String> players = new Queue<>();

        players.toQueue("Lucas");
        players.toQueue("Camila");
        players.toQueue("Nogueira");
        players.toQueue("Vânia");
        players.toQueue("Larissa");
        players.toQueue("Elis");
        players.toQueue("Sueli");


        while (players.size() > 1) {

            for (int i = 0; i < hot; i++) {

                players.toQueue(players.unQueue());

            }

            System.out.println("O jogador: " + players.unQueue() + " saiu nesta rodada! \n");



        }

        System.out.println("O jogador ganhador: " + players.unQueue());

    }
}

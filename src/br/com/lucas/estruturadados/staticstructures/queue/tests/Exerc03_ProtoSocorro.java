package br.com.lucas.estruturadados.staticstructures.queue.tests;

import br.com.lucas.estruturadados.staticstructures.queue.Queue;
import br.com.lucas.estruturadados.staticstructures.queue.QueuePriority;

import java.util.Random;

public class Exerc03_ProtoSocorro {

        static final String[] SENHAS = {"VERMELHO", "AMARELO", "VERDE"};
        static final int TEMPOATENDIMENTO = 5000;
        static final int ADDNOVAPESSOA = 4000;

    public static void main(String[] args) throws InterruptedException {


        resolutionProntoSocorro();

    }

    private static Pessoa addPessoaNaFila() {
        Random random = new Random();

        int i = random.nextInt(3);

        return new Pessoa("", SENHAS[i]);
    }

    private static void resolutionProntoSocorro() throws InterruptedException {
        // criando a fila inicial
        Queue<Pessoa> pessoasTodes = new QueuePriority<>(10);

        // preenchendo a fila inicial com pessoas de senhas VERMELHAS
        pessoasTodes.toQueue(new Pessoa("Givanildo", SENHAS[0]));
        pessoasTodes.toQueue(new Pessoa("Ariene", SENHAS[0]));

        // preenchendo a fila inicial com pessoas de senhas AMARELAS
        pessoasTodes.toQueue(new Pessoa("Larissa", SENHAS[1]));
        pessoasTodes.toQueue(new Pessoa("Lívia", SENHAS[1]));

        // preenchendo a fila inicial com pessoas de senhas VERDES
        pessoasTodes.toQueue(new Pessoa("Lucas", SENHAS[2]));
        pessoasTodes.toQueue(new Pessoa("Camila", SENHAS[2]));




        // criando fila auxiliares para pessoas com senhas AMARELAS e VERDES
        Queue<Pessoa> pessoasAmarelo = new Queue<>();
        Queue<Pessoa> pessoasVerde = new Queue<>();

        // realizando o atendimento as pessoas da fila
        while (!pessoasTodes.isEmpty()) {
            Pessoa atendido = pessoasTodes.unQueue();

            if (atendido.senha.equals(SENHAS[0])) {
                realizaAtendimento(0);
            } else if (atendido.senha.equals(SENHAS[1])) {
                pessoasAmarelo.toQueue(atendido);
            } else {
                pessoasVerde.toQueue(atendido);
            }


            while (!pessoasAmarelo.isEmpty()) {
                realizaAtendimento(1);

                pessoasAmarelo.unQueue();
            }


            while (pessoasAmarelo.isEmpty() && !pessoasVerde.isEmpty()) {
                realizaAtendimento(2);

                pessoasVerde.unQueue();
            }

            pessoasTodes.toQueue(addPessoaNaFila());
        }

    }

    private static void realizaAtendimento(int x) throws InterruptedException {
        System.out.println("Paciente de senha " + SENHAS[x] + " sendo atendido...");

        Thread.sleep(TEMPOATENDIMENTO);
    }


    public static class Pessoa implements Comparable<Pessoa> {
        private String nome;
        private String senha;

        public Pessoa(String nome, String senha) {
            this.nome = nome;
            this.senha = senha;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getSenha() {
            return senha;
        }

        public void setSenha(String senha) {
            this.senha = senha;
        }

        private int getPrioridade(String senha) {

            return switch (senha) {
                case "VERMELHO" -> 1;
                case "AMARELO" -> 2;
                case "VERDE" -> 3;
                default -> 0;
            };

        }

        @Override
        public int compareTo(Pessoa o) {
            return getPrioridade(this.senha) - getPrioridade(o.senha);
        }

        @Override
        public String toString() {
            return "Pessoa{" +
                    "nome='" + nome + '\'' +
                    ", senha='" + senha + '\'' +
                    '}';
        }

    }
}

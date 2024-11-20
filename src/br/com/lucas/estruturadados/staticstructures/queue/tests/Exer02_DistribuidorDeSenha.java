package br.com.lucas.estruturadados.staticstructures.queue.tests;

import java.util.PriorityQueue;
import java.util.Queue;

public class Exer02_DistribuidorDeSenha {

    public static void main(String[] args) {
        Queue<Pessoa> queuePessoa = getPessoas();


        int countPriority = 0;

        while (!queuePessoa.isEmpty()) {
            Pessoa pessoaAtendida;

            if (queuePessoa.peek().senha.equals("PRIORITARIO") && countPriority >= 0) {
                pessoaAtendida = queuePessoa.remove();
                countPriority--;
            } else {
                pessoaAtendida = queuePessoa.remove();
                countPriority++;
            }

            System.out.println(pessoaAtendida);
        }
    }

    private static Queue<Pessoa> getPessoas() {
        Pessoa pessoa1 = new Pessoa("Lucas", "NORMAL");
        Pessoa pessoa2 = new Pessoa("Nogueira", "PRIORITARIO");
        Pessoa pessoa3 = new Pessoa("Vânia", "PRIORITARIO");
        Pessoa pessoa4 = new Pessoa("Larissa", "NORMAL");

        Queue<Pessoa> queuePessoa = new PriorityQueue<>();


        queuePessoa.add(pessoa1);
        queuePessoa.add(pessoa2);
        queuePessoa.add(pessoa3);
        queuePessoa.add(pessoa4);
        return queuePessoa;
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

        @Override
        public int compareTo(Pessoa o) {

            if (this.senha.equals("NORMAL") && o.senha.equals("PRIORITARIO")) {
                return 1;
            } else if (this.senha.equals("PRIORITARIO") && o.senha.equals("NORMAL")) {
                return -1;
            }

            return 0;
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

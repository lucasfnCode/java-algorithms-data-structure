package br.com.lucas.estruturadados.staticstructures.queue.tests;

import br.com.lucas.estruturadados.staticstructures.queue.Queue;

public class Exer01_FilaDeDocumentos {

    public static void main(String[] args) throws InterruptedException {
        Queue<Documento> documentoQueue = createdDocumentoQueue();

        System.out.println("IMPRESSÃO INICIADA \n");
        System.out.println("====================================== \n\n");
        while (!documentoQueue.isEmpty()) {

            Documento docImpress = documentoQueue.unQueue();
            System.out.println("Imprimindo documento: " + docImpress.nome);
            System.out.println("...");
            Thread.sleep(docImpress.quantFolhas * 1000);

            System.out.println(docImpress);
            System.out.println("-------------------------------- \n");
        }
    }

    private static Queue<Documento> createdDocumentoQueue() {
        Documento doc = new Documento("Currículo - Lucas", 2);
        Documento doc2 = new Documento("Currículo - Larissa", 4);
        Documento doc3 = new Documento("Currículo - Camila", 6);
        Documento doc4 = new Documento("Currículo - Lívia", 10);

        Queue<Documento> documentoQueue = new Queue<>();

        documentoQueue.toQueue(doc);
        documentoQueue.toQueue(doc2);
        documentoQueue.toQueue(doc3);
        documentoQueue.toQueue(doc4);
        return documentoQueue;
    }


    public static class Documento{
        private String nome;
        private Integer quantFolhas;

        public Documento(String nome, Integer quantFolhas) {
            this.nome = nome;
            this.quantFolhas = quantFolhas;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Integer getQuantFolhas() {
            return quantFolhas;
        }

        public void setQuantFolhas(Integer quantFolhas) {
            this.quantFolhas = quantFolhas;
        }

        @Override
        public String toString() {
            return "Documento{" +
                    "nome='" + nome + '\'' +
                    ", quantFolhas=" + quantFolhas +
                    '}';
        }
    }
}
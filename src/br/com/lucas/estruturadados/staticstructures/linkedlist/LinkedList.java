package br.com.lucas.estruturadados.staticstructures.linkedlist;

public class LinkedList<T> {

    private Node<T> initial;
    private Node<T> last;
    private int size; // por default valor inicial 0
    public void add(T element) {
        Node<T> cell = new Node<T>(element);

        if (this.size == 0) {
            this.initial = cell;
        } else {
            this.last.setNext(cell);
        }

        this.last = cell;

        this.size++;
    }

    public int getSize() {
        return this.size;
    }

    public void clear() {

        for (Node<T> atual = this.initial; atual != null;) {
            Node<T> proximo = atual.getNext();
            atual.setElement(null);
            atual.setNext(null);
            atual = proximo;
        }

        this.initial = null;
        this.last = null;
        this.size = 0;
    }

    @Override
    public String toString() {

        if (this.size == 0) {
            return "[]";
        }

        StringBuilder builder = new StringBuilder("[");

        Node<T> atual = this.initial;

        for (int i = 0; i < this.size -1; i++) {
            builder.append(atual.getElement()).append(",");
            atual = atual.getNext();
        }
        builder.append(atual.getElement()).append("]");


        /**
         * Maneira mais usual e antiga para percorrer
         * uma lista
         *
            builder.append(atual.getElement()).append(",");

            while (atual.getNext() != null) {
                atual = atual.getNext();
                builder.append(atual.getElement()).append(",");

            }
         */

        return builder.toString();
    }
}

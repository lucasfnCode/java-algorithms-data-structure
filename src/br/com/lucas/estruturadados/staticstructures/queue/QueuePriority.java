package br.com.lucas.estruturadados.staticstructures.queue;

public class QueuePriority<T> extends Queue<T>{

    public QueuePriority(int capacity) {
        super(capacity);
    }

    public Boolean toQueue(T element) {
        Comparable<T> key = (Comparable<T>) element;

        int i;
        for (i = 0; i < super.size(); i++) {
            if (key.compareTo(super.elements[i]) < 0) {
                break;
            }
        }

        return super.add(i, element);
    }

}
package br.com.lucas.estruturadados.staticstructures.queue;

import br.com.lucas.estruturadados.staticstructures.base.StaticStructure;

public class Queue<T> extends StaticStructure<T> {

    public Queue() {
        super();
    }

    public Queue(int capacity) {
        super(capacity);
    }

    public Boolean toQueue(T element) {
        return super.add(element);
    }

    public T peek() {
        return super.elements[0];
    }

    public T unQueue() {
        final int POSITION = 0;

        T unQueuedElement = super.elements[POSITION];

        super.remove(POSITION);

        return unQueuedElement;
    }
}

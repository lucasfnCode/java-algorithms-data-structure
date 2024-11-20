package br.com.lucas.estruturadados.staticstructures.stacks;

import br.com.lucas.estruturadados.staticstructures.base.StaticStructure;

public class Stack<T> extends StaticStructure<T> {

    public Stack() {
        super();
    }

    public Stack(int capacity) {
        super(capacity);
    }

    public Boolean pile(T element) {
        return super.add(element);
    }

    public T peek() {
        T result = null;

        if (!isEmpty()) {
            result = super.elements[size() - 1];
        }

        return result;
    }

    public T unStack() {
        T result = null;

        if (!isEmpty()) {
            result = super.elements[--size];
        }

        return result;
    }
}

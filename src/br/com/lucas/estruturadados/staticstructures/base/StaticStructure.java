package br.com.lucas.estruturadados.staticstructures.base;

import java.util.Arrays;

public class StaticStructure<T> {
    protected T[] elements;
    protected int size;

    private static final int DEFAULT_CAPACITY = 10;

    public StaticStructure(int capacity) {
        this.elements = (T[]) new Object[capacity];
        this.size = 0;
    }

    public StaticStructure() {
        this(10);
    }

    private void enhanceCapacity() {

        if (this.size == this.elements.length) {
            T[] newElements = (T[]) new Object[this.elements.length * 2];

            for (int i = 0; i < this.elements.length; i++) {
                newElements[i] = this.elements[i];
            }

            this.elements = newElements;
        }
    }

    protected void rangeCheck(int position) {
        if (!(position >= 0 || position < this.size)) {
            throw new IllegalArgumentException("Posiçõa inválida ou elemento inexistente!");
        }
    }

    public int size() {
        return this.size;
    }

    public Boolean isEmpty() {
        return (Boolean) (this.size == 0);
    }

    protected Boolean add(T element) {
        this.enhanceCapacity();
        if (this.size < this.elements.length) {
            this.elements[this.size] = element;
            this.size++;
            return (Boolean) true;
        }
        return (Boolean) false;
    }

    protected Boolean add(int position, T element) {
        this.enhanceCapacity();
        this.rangeCheck(position);

        for (int i = this.size - 1; i >= position; i--) {
            this.elements[i + 1] = this.elements[i];
        }
        this.elements[position] = element;
        this.size++;
        return (Boolean) true;
    }

    protected Boolean remove(int position) {
        this.rangeCheck(position);

        for (int i = position; i < this.size - 1; i++) {
            this.elements[i] = this.elements[i + 1];
        }
        this.size--;
        return (Boolean) true;
    }

    @Override
    public String toString() {
        Object[] elementsSecond = new Object[this.size];

        for (int i = 0; i < this.size; i++) {
            elementsSecond[i] = this.elements[i];
        }

        return Arrays.toString(elementsSecond);
    }
}

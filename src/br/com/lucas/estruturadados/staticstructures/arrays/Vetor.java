package br.com.lucas.estruturadados.staticstructures.arrays;

import br.com.lucas.estruturadados.staticstructures.base.StaticStructure;

public class Vetor<T>  extends StaticStructure<T> {

    public Vetor(int capacity) {
        super(capacity);
    }

    public Vetor() {
        super();
    }

    public T get(int index) {
        super.rangeCheck(index);
        return super.elements[index];
    }

    public Boolean put(T element) {
        return add(element);
    }

    public int indexOf(T element) {
        for (int i = 0; i < size(); i++) {
            if (elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T element) {
        for (int i = size() - 1; i >= 0; i--) {
            if (elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public Boolean contains(T element) {
        return this.indexOf(element) > -1;
    }

    public Boolean remove(T element) {
        int exist = this.indexOf(element);
        rangeCheck(exist);
        return this.remove(exist);
    }

    public void clear() {
       for (int i = 0; i < size(); i++) {
           elements[i] = null;
       }
       size = 0;
    }

}
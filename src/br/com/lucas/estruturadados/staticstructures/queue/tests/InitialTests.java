package br.com.lucas.estruturadados.staticstructures.queue.tests;

import br.com.lucas.estruturadados.staticstructures.queue.Queue;

public class InitialTests {

    public static void main(String[] args) {
        Queue<Integer> integerQueue = new Queue<>();

        System.out.println(integerQueue);

        integerQueue.toQueue(45);


        integerQueue.toQueue(34);


        integerQueue.toQueue(79);


        Integer uned = integerQueue.unQueue();


        System.out.println(integerQueue);

        System.out.println(uned);

        integerQueue.toQueue(294);
        integerQueue.toQueue(23564);
        integerQueue.toQueue(7456);

        integerQueue.unQueue();
        integerQueue.unQueue();

        System.out.println(integerQueue);

        System.out.println(integerQueue.peek());

        System.out.println(integerQueue.size());
        System.out.println(integerQueue.isEmpty());
        Integer uned1 = integerQueue.unQueue();
        System.out.println(integerQueue);
        System.out.println(uned1);

    }
}

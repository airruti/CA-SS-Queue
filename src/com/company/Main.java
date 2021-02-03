package com.company;

public class Main {

    public static void main(String[] args) {
        //CAQueue Implementation Test
        CircularArrayQueue CAQueue = new CircularArrayQueue(5);

        System.out.print("CAQueue Enqueue: ");
        CAQueue.enqueue(1);
        CAQueue.enqueue(2);
        CAQueue.enqueue(3);
        CAQueue.enqueue(4);
        CAQueue.DisplayInfo();

        System.out.println("Dequeued: " + CAQueue.dequeue());
        System.out.println("Dequeued: " + CAQueue.dequeue());
        System.out.print("New List: ");
        CAQueue.DisplayInfo();

        System.out.println();

        //StackQueue Implementation Test
        StackQueue SSQueue = new StackQueue();
        System.out.print("SSQueue Enqueue: ");
        SSQueue.enqueue(1);
        SSQueue.enqueue(2);
        SSQueue.enqueue(3);
        SSQueue.DisplayInfo();

        System.out.print("SSQueue Dequeue: ");
        System.out.println(SSQueue.dequeue());
        System.out.println();

        //CAQueue Scenario 1
        for (int n:new int[] {20, 50, 100, 1000, 10000, 100000, 1000000}) {
            long startTime = System.nanoTime();
            for (int i = 0; i < n; i++){
                CAQueue.enqueue(i);
            }
            for (int i = 0; i < n; i++){
                CAQueue.enqueue(i + n);
                CAQueue.dequeue();
            }
            long endTime = System.nanoTime();
            long totalTime = endTime - startTime;
            System.out.println(n + ", " + totalTime);
        }

        //SSQueue Scenario 1
        for (int n:new int[] {20, 50, 100, 1000, 10000, 100000, 1000000}) {
            long startTime = System.nanoTime();
            for (int i = 0; i < n; i++){
                SSQueue.enqueue(i);
            }
            for (int i = 0; i < n; i++){
                CAQueue.enqueue(i + n);
                CAQueue.dequeue();
            }
            long endTime = System.nanoTime();
            long totalTime = endTime - startTime;
            System.out.println(n + ", " + totalTime);
        }

        //CAQueue Scenario 2
        for (int n:new int[] {20, 50, 100, 1000, 10000, 100000, 1000000}) {
            long startTime = System.nanoTime();
            for (int i = 0; i < n; i++){
                CAQueue.enqueue(i);
            }
            for (int i = 0; i < n; i++) {
                if (Math.random() < 0.5){
                    CAQueue.enqueue(i + n);
                }
                else {
                    CAQueue.dequeue();
                }
            }
            long endTime = System.nanoTime();
            long totalTime = endTime - startTime;
            System.out.println(n + ", " + totalTime);
        }

        //SSQueue Scenario 2
        for (int n:new int[] {20, 50, 100, 1000, 10000, 100000, 1000000}) {
            long startTime = System.nanoTime();
            for (int i = 0; i < n; i++){
                SSQueue.enqueue(i);
            }
            for (int i = 0; i < n; i++) {
                if (Math.random() < 0.5){
                    SSQueue.enqueue(i + n);
                }
                else {
                    SSQueue.dequeue();
                }
            }
            long endTime = System.nanoTime();
            long totalTime = endTime - startTime;
            System.out.println(n + ", " + totalTime);
        }
    }
}

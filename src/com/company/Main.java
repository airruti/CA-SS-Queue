package com.company;

public class Main {

    public static void main(String[] args) {
        //CAQueue Implementation
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

        //StackQueue Implementation
        StackQueue SSQueue = new StackQueue();
        System.out.print("SSQueue Enqueue: ");
        SSQueue.enqueue(1);
        SSQueue.enqueue(2);
        SSQueue.enqueue(3);
        SSQueue.DisplayInfo();

        System.out.print("SSQueue Dequeue: ");
        System.out.println(SSQueue.dequeue());
        System.out.println();

        //CAQUEUE for this one
        for (int n:new int[] {20, 50, 100, 1000, 10000, 100000, 1000000}) {
            long startTime = System.nanoTime();
            for (int i = 0; i < n; i++){//both scenarios and both queues
                CAQueue.enqueue(i + n);
                SSQueue.enqueue(i + n);
                if (Math.random() < 0.5){
                    CAQueue.enqueue(i + n);
                    SSQueue.enqueue(i + n);
                }
                else {
                    CAQueue.dequeue();
                    SSQueue.dequeue();
                }
            }
            for (int i = 0; i < n; i++){//scenario 1 and both queues
                CAQueue.enqueue(i);
                SSQueue.enqueue(i);
                CAQueue.dequeue();
                SSQueue.dequeue();
            }
            long endTime = System.nanoTime();
            long totalTime = endTime - startTime;
            System.out.println(n + ", " + totalTime);
        }
        //SSQUEUE for this one
        for (int n:new int[] {20, 50, 100, 1000, 10000, 100000, 1000000}) {
            long startTime = System.nanoTime();
            for (int i = 0; i < n; i++){//both scenarios and both queues
                //enqueue
            }
            for (int i = 0; i < n; i++){//scenario 1 and both queues
                //enqueue
                //dequee
            }
            long endTime = System.nanoTime();
            long totalTime = endTime - startTime;
            System.out.println(n + ", " + totalTime);
        }
        //CAQUEUE for this one
        for (int n:new int[] {20, 50, 100, 1000, 10000, 100000, 1000000}) {
            long startTime = System.nanoTime();
            for (int i = 0; i < n; i++){//both scenarios and both queues
                //enqueue
            }
            for (int i = 0; i < n; i++) { //scenario2 and both queues
                //if(Math.random()<.5)enqueue
                //else
                //dequee
            }
            long endTime = System.nanoTime();
            long totalTime = endTime - startTime;
            System.out.println(n + ", " + totalTime);
        }
        //SSQUEUE for this one
        for (int n:new int[] {20, 50, 100, 1000, 10000, 100000, 1000000}) {
            long startTime = System.nanoTime();
            for (int i = 0; i < n; i++){//both scenarios and both queues
                //enqueue
            }
            for (int i = 0; i < n; i++) {//scenario 2 and both queues
                //if(Math.random()<.5)enqueue
                //else
                //dequee
            }
            long endTime = System.nanoTime();
            long totalTime = endTime - startTime;
            System.out.println(n + ", " + totalTime);
        }

    }
}

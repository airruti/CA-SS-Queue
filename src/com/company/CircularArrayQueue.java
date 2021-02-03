package com.company;
import java.util.ArrayList;

public class CircularArrayQueue {
    private int rear, front = 0;
    private int capacity;
    private int size = 0;
    private ArrayList<Object> array = new ArrayList<>();

    CircularArrayQueue(int size){
        this.capacity = size;
    }

    public void enqueue(Object element){
        if (size == capacity - 1)//full queue
            return;
        array.add(rear, element);
        rear = (rear + 1) % capacity;
        size++;
    }

    public Object dequeue(){
        if (size == 0)
            return null;
        Object element = array.get(front);
        front = (front + 1) % capacity;
        size--;
        return element;
    }

    public void DisplayInfo(){
        for (int i = front; i != rear; i = (i + 1) % capacity) {
            System.out.print(array.get(i) + " ");
        }
        System.out.println();
    }

}

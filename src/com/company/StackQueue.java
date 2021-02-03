package com.company;

public class StackQueue {
    private MyStack firstStack = new MyStack();
    private MyStack secondStack = new MyStack();

    public void enqueue(Object element){
        firstStack.push(element);
    }

    public Object dequeue(){
        if(!firstStack.isEmpty() && secondStack.isEmpty()){
            while (!firstStack.isEmpty())
                secondStack.push(firstStack.pop());
        }
        return secondStack.pop();
    }

    public void DisplayInfo(){
        System.out.println(firstStack);
    }


}

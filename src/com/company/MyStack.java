package com.company;
import java.util.ArrayList;

public class MyStack {
    private ArrayList<Object> stack = new ArrayList<>();

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public Object pop(){
        Object element = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        return element;
    }
    public void push(Object element){
        stack.add(element);
    }

    public String toString(){
        return stack.toString();
    }
}

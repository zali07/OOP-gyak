package lab10_4;

import java.util.ArrayList;

public class Stack {

    private final int capacity;
    private final ArrayList<Object> items = new ArrayList<>();

    public Stack(int capacity) {
        this.capacity = capacity;
    }

    public void push(Object obj) throws StackException {
        if(isFull()){
            throw new StackException("Stack is full!");
        }
        items.add(obj);
    }

    public void pop() throws StackException {
        if(isEmpty()){
            throw new StackException("Stack is empty!");
        }
        items.remove(items.size()-1);
    }

    public Object top() throws StackException {
        if(isEmpty()){
            throw new StackException("Stack is empty!");
        }
        return items.get(items.size()-1);
    }

    public int getSize(){
        return items.size();
    }

    public boolean isEmpty(){
        return items.size() == 0;
    }

    public boolean isFull(){
        return items.size() == capacity;
    }
}

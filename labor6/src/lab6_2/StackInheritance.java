package lab6_2;

import java.util.ArrayList;

public class StackInheritance extends ArrayList<Object> {
    private final int capacity;


    public StackInheritance(int capacity) {
        this.capacity = capacity;
    }

    public boolean isEmpty(){
        return this.size() == 0;
    }

    public boolean isFull(){
        return this.size() == capacity;
    }

    public void push(Object obj){
        if(isFull()){
            System.out.println("Stack is full" + obj);
            return;
        }
        this.add(obj);
    }

    public void pop(){
        if(isEmpty()){
            System.out.println("Stack is empty" );
            return;
        }
        this.remove(this.size()-1);
    }


    public Object top(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        return this.get(this.size()-1);
    }

    public int getSize(){
        return this.size();
    }
}

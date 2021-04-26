package lab7_1;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListQueue implements IQueue{

    private ArrayList<Object> items;
    private final int CAPACITY;

    public ArrayListQueue(int capacity) {
        CAPACITY = capacity;
        items = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return items.isEmpty();
    }

    @Override
    public boolean isFull() {
        return items.size() == CAPACITY;
    }

    @Override
    public void enQueue(Object obj) {
        if(!isFull()){
            items.add(obj);
        }else{
            System.out.println("Q is full!");
        }
    }

    @Override
    public Object deQueue() {
        if(!isEmpty()){
            return items.remove(0);
        }
        System.out.println("Q is empty!");
        return null;
    }

    @Override
    public void printQueue() {
        System.out.println("ArrayListQueue: " + items);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrayListQueue that = (ArrayListQueue) o;
        return Objects.equals(items, that.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(items, CAPACITY);
    }
}

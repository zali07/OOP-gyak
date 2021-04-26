package lab7_1;

public class CircularQueue implements IQueue{
    private final int CAPACITY;
    private Object[] items;
    private int front;
    private int rear;


    public CircularQueue(int capacity) {
        CAPACITY = capacity;
    }


    @Override
    public boolean isEmpty() {
        if (front == -1)
            return true;
        else
            return false;
    }

    @Override
    public boolean isFull() {
        if (front == 0 && rear == CAPACITY - 1) {
            return true;
        }
        if (front == rear + 1) {
            return true;
        }
        return false;
    }

    @Override
    public void enQueue(Object obj) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1)
                front = 0;
            rear = (rear + 1) % CAPACITY;
            items[rear] = obj;
            System.out.println("Inserted " + obj);
        }
    }

    @Override
    public Object deQueue() {
        int element;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return (-1);
        } else {
            element = (int) items[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % CAPACITY;
            }
            return (element);
        }
    }

    @Override
    public void printQueue() {
        int i;
        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {
            System.out.println("Front -> " + front);
            System.out.println("Items -> ");
            for (i = front; i != rear; i = (i + 1) % CAPACITY)
                System.out.print(items[i] + " ");
            System.out.println(items[i]);
            System.out.println("Rear -> " + rear);
        }
    }
}

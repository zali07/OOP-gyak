package lab4_3;

public class Main {
    public static void main (String[] args){
        MyArray a1 = new MyArray(3);
        a1.print("a1");
        a1.fillRandom(3,7);
        a1.print("a1");

        MyArray a2 = new MyArray(a1);
        a2.print("a2");
        a2.sort();
        a2.print("a2");
        a1.print("a1");

        double[] array = {1, 2, 3};
        MyArray a3 = new MyArray(array);
        a3.print("a3");
    }
}

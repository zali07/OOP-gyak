package lab4_3;

import java.util.Arrays;
import java.util.Random;

public class MyArray {
    private int length;
    private double[] elements;

    public MyArray(int length){
        this.length = length;
        this.elements= new double[length] ;
    }

    public MyArray(MyArray array){
        this.length = array.length;
//        this.elements = array.elements; HIBA - sekely masolat
        this.elements = new double[array.length];
        for(int i=0; i<array.elements.length; ++i){
            this.elements[i] = array.elements[i];
        }
        // Arrays.copy
    }

    public MyArray(double[] elements){
        this.length = elements.length;
        this.elements = new double[elements.length];
        for(int i=0; i<elements.length; ++i){
            this.elements[i] = elements[i];
        }
    }

    public MyArray(String fname){

    }

    public void fillRandom(double a, double b){
        Random random = new Random();
        for(int i=0; i<this.length; ++i){
            this.elements[i] = random.nextDouble()*(b-a)+a;
        }
    }

    public double mean(){
        return 0;
    }

    public double stddev(){
        return 0;
    }

    public void sort(){
        Arrays.sort(elements);
    }

    public void print(String arrayName){
        System.out.print(arrayName+":");
        for(double d: elements) {
            System.out.printf("%6.2f ",d);
        }
        System.out.println();
    }
}

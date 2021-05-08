package lab11;

import java.util.Arrays;

public class main {

    public static int maxNumberOfOperations = 30;

    public static void main(String[] args) {

        String[]  sa_array = new String [10];
        Arrays.fill(sa_array,"");

        Thread addition1 = new AddToArray(sa_array);
        Thread addition2 = new AddToArray(sa_array);
        Thread addition3 = new AddToArray(sa_array);
        Thread addition4 = new AddToArray(sa_array);

        addition1.start();


    }
}


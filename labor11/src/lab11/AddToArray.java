package lab11;

import java.util.Random;

public class AddToArray extends Thread{

    private String[] array;
    public static Random random = new Random();

    public AddToArray (String[] array) {
        this.array = array;
    }

    @Override
    public void run() {

        while (true){
            synchronized (array) {
                work();
                //print the array
                print();
            }

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }

    }

    private void work(){
        //generalas
        String character = String.valueOf((char)(random.nextInt('z'-'a')+'a'));
        String generatedString = character.repeat(3);
        //min poz
        int minPos = findMinPos();
        //generlt string behelyezese a tombe
        array[minPos] = generatedString;
    }

    private int findMinPos(){
        int minInd = 0;
        String min = array[minInd];
        for (int i = 1; i < array.length; i++){
            if(array[i].compareTo(min) < 0){
                min = array[i];
                minInd = i;
            }
        }
        return minInd;
    }

    public void print(){
        System.out.print(Thread.currentThread().getName() + ": ");
        for (String s : array) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

}

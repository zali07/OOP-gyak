package lab11;

public class TakeSomeFromArray extends Thread{

    private String[] array;
    private int numberOfReplacements;
    private String stringToBeReplaced;
    private int currentNumberOfReplacements = 0;

    public TakeSomeFromArray(String[] array, int numberOfReplacements, String stringToBeReplaced, int currentNumberOfReplacements) {
        this.array = array;
        this.numberOfReplacements = numberOfReplacements;
        this.stringToBeReplaced = stringToBeReplaced;
        this.currentNumberOfReplacements = currentNumberOfReplacements;
    }

    @Override
    public void run() {
        while(currentNumberOfReplacements < numberOfReplacements){

            //try to replace
            //megkeressuk az adott karakterlancot
            int findAt = findItem();


            //successful replace
            if(findAt != -1){
                currentNumberOfReplacements++;
                main.maxNumberOfOperations--;
                //replace
                //print info
            }


            //if(...) break;

            //print info

        }
    }
    private int findItem(){


        return -1;
    }
}

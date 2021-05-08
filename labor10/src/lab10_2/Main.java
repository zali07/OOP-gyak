package lab10_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        PrintStream printStream;
        try {
           printStream = new PrintStream("labor10/warnings.csv");
        } catch (FileNotFoundException e) {
            System.out.println("Can't create file");
            e.printStackTrace();
            return;
        }
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("labor10/students.csv"));
        } catch (FileNotFoundException e) {
            System.out.println("Can't open file");
            e.printStackTrace();
        }

        while(true){
            assert scanner != null;
            if (!scanner.hasNextLine()) break;
            String line = scanner.nextLine();
            String[] array = line.split(",");
            if(array.length < 7){
                System.out.println("Incomplete line: " + line);
                continue;
            }
            //NeptunId, firstname, lastname, credits, birthyear, birthmonth, birthday

            int credit;
            try{
                credit = Integer.parseInt(array[3].trim());
            }
            catch (NumberFormatException e){
                System.out.println("Number format exception: " + line + ":" + array[3]);
                continue;
            }

            //int year = -1 ,month = -1 ,day = -1;
            int year ,month ,day ;

            try{
                year = Integer.parseInt(array[4].trim());
            }
            catch (NumberFormatException e){
                System.out.println("Number format exception: " + line + ":" + array[4]);
                continue;
            }

            try{
                month = Integer.parseInt(array[5].trim());
            }
            catch (NumberFormatException e){
                System.out.println("Number format exception: " + line + ":" + array[5]);
                continue;
            }

            try{
                day = Integer.parseInt(array[6].trim());
            }
            catch (NumberFormatException e){
                System.out.println("Number format exception: " + line + ":" + array[6]);
                continue;
            }

            if(!DateUtil.validDate(year,month,day)){
                System.out.println("Invalid date: " + line);
            }

            if(credit<30){
                printStream.println(line);
            }
        }
        scanner.close();
        printStream.close();

    }
}

package lab4_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        readFilePrintItsLineNumbered("labor4/lab4_1_input.txt");
        ArrayList<Person> persons = readFromCSVFile("labor4/lab4_1_input.csv");
        for( Person person:persons){
            System.out.println(person);
        }
    }

    public static void readFilePrintItsLineNumbered(String fileName) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(1);

        }
        int lineCounter = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            ++lineCounter;
            System.out.println(lineCounter + ". " + line);
        }
    }

    public static ArrayList<Person> readFromCSVFile(String fileName) {
        ArrayList<Person> persons = new ArrayList<>();
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("nem letezo fajl");
            return persons;
        }
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] items = line.split(",");
            if(line.isEmpty()){
                continue;
            }
            String firstName = items[0].trim();
            String lastName = items[1].trim();
            int birthYear = Integer.parseInt( items[2].trim() );
            persons.add(new Person(firstName, lastName, birthYear));
        }
        return persons;
    }
}

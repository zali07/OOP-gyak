package lab7_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IDictionary dictionary = new ArrayListDictionary();
        System.out.println(dictionary.size());

        Scanner scanner = new Scanner(System.in);
        while( true ) {
            System.out.print("Word to find ( Enter <end> for exit): ");
            String word = scanner.nextLine();
            if( word.equalsIgnoreCase( "end")){
                break;
            }
            System.out.println(" Find(" + word + "): " + dictionary.find(word));
        }
    }
}

package lab10_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String sor;
        double count = 0;
        Scanner scanner = new Scanner(System.in);
        String[] tokens = scanner.nextLine().split(" ");
        for (int i = 0;i<tokens.length;++i){
            try{
                count = count + Double.parseDouble(tokens[i]);
            }
            catch(NumberFormatException e){
                System.out.println("Not a number");
            }
        }
        System.out.println(count);
    }
}

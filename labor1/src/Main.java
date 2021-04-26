public class Main {
    public static void main(String[] args) {
        System.out.println("fuzi zalan");

        String nev = "zalan";
        for(int i = 0; i<nev.length(); ++i){
            System.out.println(nev.charAt(i));
        }

        String mg1 = "F";
        String mg2 = "Z";

        System.out.println(mg1+mg2);

        String almafa = "ALMAFA";

        for (int i = 0; i<almafa.length(); ++i){
            for (int j = 0; j<=i; ++j){
                System.out.print(almafa.charAt(j));
            }
            System.out.println();
        }

        String monog = "Kerekes Balint Adam Jozsef";
        monog.split(" ");
        System.out.println(monog);
        for (int i = 0; i<monog.length(); ++i){
            for (int j = 0; j<=i; ++j){

            }
            System.out.println();
        }
        monog.split(" ");
    }
}

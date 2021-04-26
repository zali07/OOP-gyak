package lab7_2;

public interface IDictionary {

    final String DICTIONARY_FILE = "labor7/dic.txt";
    public boolean add(String word);
    public boolean find(String word);
    public int size();


}

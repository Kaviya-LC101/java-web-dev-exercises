package exercises;
import java.util.Scanner;
public class Alice {
    public static void main (String[] args){
        String  sentence = "Alice was beginning to get very tired of sitting by her sister " +
                "on the bank, and of having nothing to do: once or twice she had peeped into the " +
                "book her sister was reading, but it had no pictures or conversations in it, 'and " +
                "what is the use of a book,' thought Alice 'without pictures or conversation?'";
        sentence=sentence.toLowerCase();
        System.out.println(sentence);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Search Term: ");
        String search= input.nextLine();
        search= search.toLowerCase();
        System.out.println(search);
        if(sentence.contains(search)){
            System.out.println("Search word '"+search+"' is found in the sentence");
            int indexofWord=sentence.indexOf(search);
            System.out.println("Index of the word '"+search+"' in sentence : "+ indexofWord);
            int length=search.length();
            System.out.println("Length of the word '"+search+"': "+ length);
            sentence=sentence.replace(search,"");
            System.out.println(sentence);
        }
        else{
            System.out.println("Search word '"+search+"' is not found in the sentence");
        }


    }
}

package exerciseChapter3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayListExcercise2 {
    public static void main (String[] args){
        ArrayList<Integer> numList= new ArrayList<>();
        for(int i=1;i<=10;i++){
            numList.add(i);
        }
        System.out.println("Sum of Even numbers ");
        System.out.println(sumEven(numList));

        /* ArrayList<String> wordList= new ArrayList<>();
        wordList.add("two");
        wordList.add("three");
        wordList.add("four");
        wordList.add("five");
        wordList.add("six");
        wordList.add("seven");
        wordList.add("eight");
        System.out.println("Words Containing 5 letters");*/
        String sentence="I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse";
        wordSearch(sentence);
    }


    public static int sumEven(ArrayList<Integer> arr){
        int total =0;
        for (int integer :arr){
            if(integer % 2==0 ){
                total +=integer;
            }
        }
        return total;
    }


    public static void wordSearch(String phrase ){
        String[] sentenceArray=phrase.split(" ");
        ArrayList<String> wordList= new ArrayList<>(Arrays.asList(sentenceArray));
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Word length for Search :");
        int number = input.nextInt();
        for(String word :wordList){
            if(word.length()==number){
                System.out.println(word);
            }
        }
    }


}

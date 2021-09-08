package StudioChapter3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class CountingCharacters {
    public static void main (String[] args){
        /*String sentence= "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. " +
                "So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the" +
                " equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";*/
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String sentence= input.nextLine();
        sentence=sentence.replaceAll("[^a-zA-Z]","");// Bonus mission removes the non alphabetic character
        sentence = sentence.toLowerCase();// to lower case

        char[] charactersInString = sentence.toCharArray();

           HashMap<Character ,Integer> characterCount=new HashMap<Character, Integer>();
        for(char c: charactersInString){
             if(characterCount.containsKey(c)){
                 characterCount.put(c,characterCount.get(c)+1);
             }
             else{
                 characterCount.put(c,1);
             }

        }
        for(Map.Entry<Character, Integer> characterCountMap:characterCount.entrySet()){
            System.out.println(characterCountMap.getKey()+": "+characterCountMap.getValue());
        }

    }
}

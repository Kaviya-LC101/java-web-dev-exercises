package exerciseChapter3;

import java.util.Arrays;
public class ArrayExercise1 {
    public static void main(String[] args){
        int[] numsArray= {1,1,2,3,5,8};
        System.out.println("odd numbers in Array");
        for(int i=0;i< numsArray.length;i++){
            if(numsArray[i]%2==1){
                System.out.println(numsArray[i]);
            }
        }
        String sentence="I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse";
        String[] wordsArray=sentence.split(" ");
        System.out.println(Arrays.toString(wordsArray));
        String[] sentenceArray=sentence.split("\\.");
        System.out.println(Arrays.toString(sentenceArray));


    }
}

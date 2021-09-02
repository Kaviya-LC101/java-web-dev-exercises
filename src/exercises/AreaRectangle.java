package exercises;
import java.util.Scanner;
public class AreaRectangle {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the length of the Rectangle");
        int length=input.nextInt();
        System.out.println("Please enter the width of the Rectangle");
        int width=input.nextInt();
        int area=length*width;
        System.out.println("Area of the Rectangle:"+area);

    }


}

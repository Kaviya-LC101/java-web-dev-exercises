package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
public class Area {
    public static void main (String[] args){
        //double pi=3.14;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of Circle: ");
        if(input.hasNextDouble()) {
            Double  radius= input.nextDouble();
            //Bonus Mission
            if (radius > 0) {
                //double area=pi*r*r;
                Double area = Circle.getArea(radius);
                System.out.println("Area of the Circle : " + area);
            }
            else {
                System.out.println("Please enter the valid radius");
            }
        }
             else {
                System.out.println("Please enter the valid radius");
            }

    }
}

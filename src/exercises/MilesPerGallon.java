package exercises;
import java.util.Scanner;
public class MilesPerGallon {
    public static void main (String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Miles you have Driven ");
        double miles=input.nextDouble();
        System.out.println("Enter the amount of Gas consumed in Gallons");
        double gas = input.nextDouble();
        double milePerGallon=miles/gas;
        System.out.println("Miles per Gallon: "+milePerGallon);
    }
}

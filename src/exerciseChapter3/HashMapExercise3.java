package exerciseChapter3;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class HashMapExercise3 {
    public static void main(String[] args){
        HashMap<Integer, String> students = new HashMap <>();
        Scanner input =new Scanner(System.in);
        String newStudent;
        System.out.println("Enter the name of the Student (or Enter to Finish");
        do{
            System.out.print("Student: ");
            newStudent=input.nextLine();
            if(!newStudent.equals("")){
                System.out.println("Id: ");
                Integer newID= input.nextInt();
                students.put(newID,newStudent);
                input.nextLine();
            }

        }while(!newStudent.equals(""));
        input.close();
        System.out.println("\nClass roster:");
        for(Map.Entry<Integer, String> student: students.entrySet()){
            System.out.println(student.getValue()+"'s ID: "+student.getKey());
        }
    }
}

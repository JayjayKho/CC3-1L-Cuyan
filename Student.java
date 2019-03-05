package student;
import java.util.*;

public class Student {

    public static String ID;
    public static int credithrs;
    public static int points;
    public static int grade;
    
    public Student(String id, int hours, int point){
        ID = id;
        credithrs = hours;
        points = point;
    }
    
    public String getID(){
        return ID;
    }
    
    public int getCredithrs(){
        return credithrs;
    }
    
    public static void Compute(){
       grade = points / credithrs;
    }
    
    public String toString(){
        return "ID #: " + ID + "\nNumber of credit hours earned: " 
                + credithrs + "\nNumber of points earned: " + points;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ID #: ");
        String id = sc.nextLine();
        
        System.out.println("Number of credit hours earned: ");
        int hours = sc.nextInt();
        
        System.out.println("Number of points earned: ");
        int point = sc.nextInt();
        
        Student record = new Student(id,hours,point);
        System.out.println("\n"+ record);
        Compute();
        System.out.println("Grade is: " + grade);
    }
    
}

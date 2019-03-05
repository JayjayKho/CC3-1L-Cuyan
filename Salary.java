package salary;
import java.io.*;

public class Salary {
    public static double pay, rhour, ohour, otime;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the hourly pay rate: ");
        pay = Integer.parseInt(br.readLine());
        
        System.out.println("Enter the regular hours: ");
        rhour = Integer.parseInt(br.readLine());
        
        System.out.println("Enter overtime hours: ");
        ohour = Integer.parseInt(br.readLine());
        
        OvertimeCalculation();
        
        System.out.println("Your weekly salary is: " + otime);
    }
    
    public static void OvertimeCalculation() throws IOException{
        otime = rhour * pay + (ohour * 1.5) * pay;
    }
}

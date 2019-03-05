package intarray;
import java.util.*;

public class IntArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[5];
        for(int i=0; i<5; i++){
            System.out.print("Enter an integer: ");
            array[i] = sc.nextInt();
        }
        
        System.out.println("\nFirst to last: ");
        for(int i=0; i<5; i++){
            System.out.print(array[i] + "   ");
            
        }
        
        System.out.println("\nLast to first: ");
        for(int i = array.length -1; i>=0; i--){
            System.out.print(array[i] + "   ");
        }
        
        
        
    }
    
    
    
}

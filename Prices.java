package prices;
import java.util.*;
public class Prices {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double array[] = new double[20];
        
        double sum = 0;
        
        
        for(int i = 0; i < 20; i++){
            System.out.print("Enter a price: $");
            array[i] = sc.nextDouble();
        }
        
        for(double value : array){
            sum += value;            
        }
            System.out.println("\nSUM: $" + sum);
            
            double ave = sum/array.length;
            System.out.println("AVERAGE: $" + ave);
        
        System.out.println("Numbers less than $5.00: ");
        for(int i =0; i <20; i++){
            if(array[i] < 5.00){
                System.out.print(array[i]+ "  ");
            }
        }
        
        System.out.println("\nNumbers higher than the average value: ");
        for(int i =0; i <20; i++){
            if(array[i] > ave){
                System.out.print(array[i] + "  ");
            }
        }
    }
    
}

package pizzachoice;
import javax.swing.*;
import java.io.*;

public class PizzaChoice {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        String choice;
        String size[] = {"small","medium","large","extra large"};
        double price[] = {6.99, 8.99, 12.50, 15.00};
        do{
            
            System.out.println("Enter Pizza Size (S, M, L or X): ");
            String PickS = br.readLine();
            
            if("S".equals(PickS)){
                System.out.println("The price of a " + size[0] + " pizza is $" + price[0]);
            }
            
            else if("M".equals(PickS)){
                System.out.println("The price of a " + size[1] + " pizza is $" + price[1]);
            }
            
            else if("L".equals(PickS)){
                System.out.println("The price of a " + size[2] + " pizza is $" + price[2]);
            }
            
            else if("X".equals(PickS)){
                System.out.println("The price of a " + size[3] + " pizza is $" + price[3]);
            }
            
            else{
                System.out.println("Invalid input.");
                JOptionPane.showMessageDialog(null, "Invalid input", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
            
            
            System.out.println("Do you want to try again? [Y/N]\n");
            choice = br.readLine();
        }
        
        while("Y".equals(choice));
    }
    
}

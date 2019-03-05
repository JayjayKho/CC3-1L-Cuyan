package exponent2;
import java.io.*;

public class Exponent2 {
    public static BufferedReader br;
    public static int num;
    public static int square;
    public static int cube;
    
    public static void main(String[] args) throws IOException{
        br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an integer: ");
        num = Integer.parseInt(br.readLine());
        Cubes();
        
        System.out.println("Squared: " + square);
        System.out.println("Cube: " + cube);
    }
    
    public static void Squares() throws IOException{
        square = num * num;
    }
    
    public static void Cubes() throws IOException{
        Squares();
        cube = square * num;        
    }
    
}

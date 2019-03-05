package exponent;
import java.io.*;

public class Exponent {
    public static BufferedReader br;
    public static int num;
    public static int square;
    public static int cube;
    
    public static void main(String[] args) throws IOException{
        br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an integer: ");
        num = Integer.parseInt(br.readLine());
        Squares();
        
        System.out.println("Squared: " + square);
        System.out.println("Cube: " + cube);
    }
    
    public static void Squares() throws IOException{
        square = num * num;
        Cubes();
    }
    
    public static void Cubes() throws IOException{
        cube = square * num;
    }
    
}

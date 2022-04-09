package java;
import java.util.Scanner;
/**
 *
 * @author sandhya
 */
public class fartoceli {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temparature in Faranheat:");
        double temp = sc.nextDouble();
        double celisus  =  ((5*temp -32.0)/9.0);
        System.out.println("Temprature in Faranheat :"+ temp + "\t" + "\t" + "\t" +"Temprature in Celsius:"+ celisus);
        
    }
    
}

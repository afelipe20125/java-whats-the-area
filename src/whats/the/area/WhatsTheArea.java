
package whats.the.area;

/**
 *
 * Name: Alejandro felipe
 * Project Name: whats the area
 * Period: 7
 *  
 */

// Import Scanner
import java.util.Scanner;
public class WhatsTheArea {

//    Create Scanner object HERE so you may use the scanner 
//    throughout all methods
   private static Scanner in = new Scanner (System.in);
    public static void main(String[] args) {
        // Happy Coding!        
       int surfaceArea = 0;
       surfaceArea += triangle();
       surfaceArea += triangle();
       surfaceArea += square();
       surfaceArea -= square();
       
       System.out.println("The total area of michaels truck is "+ surfaceArea);
       
       
        
    }
    public static int triangle()
    {
     System.out.println("the area of a triangle is 1/2 * base * height");
        System.out.println("base");
        int base = in.nextInt();
        System.out.println("height");
        int height = in.nextInt();
        int area = (int)( 0.5 * height * base );  
        System.out.println("The area of this shape is: "+ area);
        return area;
    } 
    
    public static int square()
            {
         System.out.println("height of square");
         int height = in.nextInt();
         System.out.println("base of square");
         int base = in.nextInt();
         int area = (int)(base * height);
         System.out.println("The area of this shape is: "+ area);
         return area;
                
                
            }
    
    
  }






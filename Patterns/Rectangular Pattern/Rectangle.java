import java.util.*;

public class Rectangle{
   public static void main(String[] args) {
     // We have to make a triangle of width=5 and height=4
    
     int height = 5;
     int width = 4;
 
 
     for(width = 1 ;width<=5; width++){
         for(height=1; height<=4; height++){
             System.out.print('*');
         }
         System.out.println();
 
     }
   }

}
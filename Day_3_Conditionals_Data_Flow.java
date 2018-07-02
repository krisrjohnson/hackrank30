// Day 3
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
   
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int N = scan.nextInt(); 
      scan.close();
          
      // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
      if (N % 2 == 1) {System.out.println("Weird");}
        else if ((N > 1 && N < 6) || (N > 20)) {System.out.println("Not Weird");}
        else if (N > 5 && N < 21) {System.out.println("Weird");}

/*   If  is odd, print Weird
If  is even and in the inclusive range of  to , print Not Weird
If  is even and in the inclusive range of  to , print Weird
If  is even and greater than , print Not Weird
*/   
   
   }
}
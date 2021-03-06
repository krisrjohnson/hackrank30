// Day 10
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
        /* convert the integer to binary string then to a char array */
        char A[] = Integer.toBinaryString(n).toCharArray();
        
        int streaker = 1;
        int maxStreak = 1;
        
        for (int i = 1; i < A.length; i++) {
            //System.out.println(A[1] + " " + A[0]);
            //System.out.println(i + " " + A[i] + " " + (i-1) + " " + A[i-1]);
            if (Integer.parseInt(String.valueOf(A[i]))==1 && Integer.parseInt(String.valueOf(A[i-1]))==1) 
            {  
                streaker++;
            }
            if (streaker > maxStreak) {
                maxStreak = streaker;
            }
            // reset streak if current digit is 0 (A[0] will always be 1) //
            if (Integer.parseInt(String.valueOf(A[i])) == 0){
                streaker = 0;
            }
            if (Integer.parseInt(String.valueOf(A[i])) == 1 && Integer.parseInt(String.valueOf(A[i-1]))==0) {
                streaker = 1;
            }
        }
                
       System.out.println(maxStreak);
    }
}
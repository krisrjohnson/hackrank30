import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        
        int z = scan.nextInt();
        scan.nextLine();
        
        for (int i = 1; i <= z; i++) {
          String abc = scan.nextLine();
            //System.out.println(abc);
            char[] myCharArray = abc.toCharArray();

            for (int j = 0; j < abc.length(); j++) {
                 if (j % 2 == 0) {System.out.print(myCharArray[j]);}
            }
            System.out.print(" ");
            for (int j = 0; j < abc.length(); j++) {
                if (j % 2 == 1) {System.out.print(myCharArray[j]);}
            }
            System.out.println();
        }
    }
}
// Do not like having this double loop sitch //
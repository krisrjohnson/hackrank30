import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        
        int z = in.nextInt();
        in.nextLine();
        
        for (int i = 1; i <= n; i++) {
            String abc = in.nextLine();
            String oddString = "";
            String eveString = "";
            char[] myCharArray = abc.toCharArray();
            
            for (int j = 0; j < abc.length(); j++) {
                if (j % 2 == 0) {eveString += Character.toString(myCharArray[j]);}
                else {oddString += Character.toString(myCharArray[j]);}
            }
            System.out.println(eveString + " " + oddString);
        }
    }
}
// Do not like having this double loop sitch //
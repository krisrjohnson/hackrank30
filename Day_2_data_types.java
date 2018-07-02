

// day 2
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double meal_cost = in.nextDouble();
        int tip_percent = in.nextInt();
        int tax_percent = in.nextInt();
        in.close();
        double tax_tip;
        int meal_total;
        
        // int times double convets to double, the .01 is bc tip_percent and tax_percent are percentages
        tax_tip = (tip_percent + tax_percent) * meal_cost * .01;
                
        // output requested to be rounded to nearest int:
        meal_total = (int) Math.round(meal_cost + tip + tax);
        
        //System.out.println(meal_total);
        System.out.println("The total meal cost is " + meal_total + " dollars.");
    }
}
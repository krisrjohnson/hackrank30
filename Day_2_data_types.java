

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
        double tip;
        double tax;
        int meal_total;
        
        tip = tip_percent * meal_cost * .01;
        tax = tax_percent * meal_cost * .01;
        meal_total = (int) Math.round(meal_cost + tip + tax);
        
        //System.out.println(meal_total);
        System.out.println("The total meal cost is " + meal_total + " dollars.");
    }
}
// java Calendar
// month is ordinal
// day of week is not! Worse 1 = Sunday!!!!

// getGregorianCalendar, SimpleDateFormat, and joda are all more up to date calendar/datetime tools

import java.util.Scanner;
import java.util.Calendar;

public class Solution {
    public static String getDay(String day, String month, String year) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, Integer.parseInt(year));
        cal.set(Calendar.MONTH, Integer.parseInt(month)-1);
        cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(day));
        int dayOfWeek = cal.get(cal.DAY_OF_WEEK);
        String dayString = "";
        switch (dayOfWeek) {
            case 1: dayString = "SUNDAY";
                break;
            case 2: dayString = "MONDAY";
                break;
            case 3: dayString = "TUESDAY";
                break;
            case 4: dayString = "WEDNESDAY";
                break;
            case 5: dayString = "THURSDAY";
                break;
            case 6: dayString = "FRIDAY";
                break;
            case 7: dayString = "SATURDAY";
                break;
        }
        return dayString;
        
    }

// provided by hackerrank:
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	String month = in.next(); // these should all be ints! int month = in.nextInt();!!!
    	String day = in.next();
    	String year = in.next();

    	System.out.println(getDay(day, month, year));
    } 
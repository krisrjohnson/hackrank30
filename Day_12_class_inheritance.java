/*
complete the Student class
class constructor with params
	String firstName, string lastName, integer id, array[int] scores
char calculate() method
	returns letter value based on student's average grades
	O, 90+
	E, 80-90
	A, 70-80
	P, 55-70
	D, 40-55
	T, 0-40		all are inclusive of lower value, exclusive higher (so O is 90-100, E is 80-89 really)
*/

// provided 
import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

// my code
class Student extends Person{
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    Student(String firstName, String lastName, int identification, int[] testScores) {
        super(firstName, lastName, identification);
        this.testScores = testScores;
    }
    
        /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    public char calculate() {
        int arraySum = 0;
        int avg = 0;
        char grade = 'N';
        for(int i = 0; i < testScores.length; i++) {
            arraySum += testScores[i];
        }
        avg = arraySum / testScores.length;
        
        if (avg >= 90) {
            grade = 'O';
        } else if (avg >= 80) {
            grade = 'E';
        } else if (avg >= 70) {
            grade = 'A';
        } else if (avg >= 55) {
            grade = 'P';
        } else if (avg >= 40) {
            grade = 'D';
        } else {grade = 'T';}
        return grade;
    }




// provided//
class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}
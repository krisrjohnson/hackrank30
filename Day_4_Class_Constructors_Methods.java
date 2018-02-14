public class Person {
    private int age;	
  
	public Person(int initialAge) {
  		// Add some more code to run some checks on initialAge
        if (initialAge >= 0) {
            age = initialAge;
        } else {
            age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
	}


	public void amIOld() {
  		// Write code determining if this person's age is old and print the correct statement:
        String agePhrase;
        if (age < 13) {
            agePhrase = "You are young.";
        } else if (age < 18) {
            agePhrase = "You are a teenager.";
        } else {agePhrase = "You are old.";}
        System.out.println(agePhrase);
	}

	public void yearPasses() {
  		age++;
	}

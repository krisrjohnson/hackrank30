// day 1
public class Solution {
	public static void main(String[] args) {
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";

		Scanner scan = new Scanner(System.in);

		int j;
		double e;
		String t;

		j = scan.nextInt();
		e = scan.nextDouble(); // automatically jumps to next line
		scan.nextLine(); // moves scan to beginning of next line

		t = scan.nextLine(); // pulls whole line of text

		System.out.println(i+j);
		System.out.println(d+e);
		System.out.println(s+t);

		scan.close();	
	}
}
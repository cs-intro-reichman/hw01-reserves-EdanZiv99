/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		int min = Integer.parseInt(args[0]);
		int max = Integer.parseInt(args[1]); 

		int a = (int) (min + Math.random() * (max - min));  
		int b = (int) (min + Math.random() * (max - min)); 
		int c = (int) (min + Math.random() * (max - min));
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("The minimal generated number was " + Math.min(a, Math.min(b, c)));
	}
}

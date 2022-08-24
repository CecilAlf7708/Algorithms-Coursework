/*
 * Alfred Thomas Cecil
 * 8/24/22
 * O(n)
 */
import java.util.*;

public class Exercise_22_3 {
	public static void main(String[] args) {
		String a, b = "";
		Scanner input = new Scanner(System.in);
		int index = 0;
		char c, d;
		boolean t = false;
		boolean f = false;
		boolean t2 = false;
		boolean f2 = false;
		System.out.print("Please enter a String(1): ");
		a = input.next();
		System.out.print("Please enter a String(2): ");
		b = input.next();
		c = a.charAt(0);
		d = b.charAt(0);
		if(b.length() > a.length()) {
			for(int x = 0;x < b.length();x++) {
				
			}
		}
		else {
			index = 0;
			for(int x = 0;x < a.length();x++) {
				c = a.charAt(x);
				d = b.charAt(index);
				if(c != d && x == a.length() - 1 && index != b.length() - 1) {
					x = 0;
					index++;
				}
				else if(c == d) {
					t = true;
					x = a.length();
					index = x;
				}
				else if(c != d && index == b.length() - 1) {
					f = true;
				}
			}
			if(t == true) {
				System.out.print("Match at index " + index);
			}
			if(f == true) {
				System.out.print("Strings have no matched index");
			}
		}
	}
}

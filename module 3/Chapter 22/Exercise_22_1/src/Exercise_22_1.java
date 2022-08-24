/*
 * Alfred Thomas Cecil
 * 8/24/22
 * Time Estimate O(n)
 */
import java.util.*;

public class Exercise_22_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char a;
		char b;
		boolean t = false;
		String temp = "";
		String f = "";
		System.out.print("Enter a String: ");
		String s = input.next();
		for(int i = 1; i < s.length(); i++) {
			a = s.charAt(i - 1);
			b = s.charAt(i);
			if(a < b) {
				temp = temp + a;
			}
			else if(a >= b) {
				temp = temp + a;
				if(temp.length() > f.length()) {
				f = temp;
				temp = "";
				t = true;
				}
				else{
					temp = "";
					t = true;
				}
			}
		}
		
		if( t = true) {
		a = s.charAt(s.length() - 2);
		b = s.charAt(s.length() - 1);
		if(a < b && temp.length() > f.length()) {
			temp = temp + b;
			f = temp;
		}
		}
		System.out.print("Maximum consecutive String is: " + f);
	}
}

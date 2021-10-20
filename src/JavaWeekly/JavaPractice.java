package JavaWeekly;

import java.util.Scanner;

public class JavaPractice {
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a string to convert via cypher:");
		String s1 = in.nextLine();
		System.out.println(Cypher(s1));
	}
	
	public static String Cypher(String s1) {
		String abc = "abcdefghijklmnopqrstuvwxyz";
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < (s1.length()); i++) {
			char c = s1.charAt(i);
			
			if(abc.indexOf(Character.toLowerCase(c)) > -1) {
				int n = Math.subtractExact(25, s1.indexOf(c));
				
				if(Character.isUpperCase(c)) {
					sb.append(Character.toUpperCase(abc.charAt(n)));
				} else {
					sb.append(abc.charAt(n));
				}
			} else {
					sb.append(c);
				}
			}
		return sb.toString();  
	}
}
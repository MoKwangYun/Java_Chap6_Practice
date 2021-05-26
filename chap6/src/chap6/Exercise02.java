package chap6;
import java.util.*;

public class Exercise02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s =  scanner.nextLine();
		s = s.trim();
		StringTokenizer st = new StringTokenizer(s, "+ ");
		
		double n = st.countTokens();
		int sum = 0;
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
			int i = Integer.parseInt(token);
			sum += i;
		}
		
		System.out.println("��=" + sum + ", ���=" + sum/n);
	}
}

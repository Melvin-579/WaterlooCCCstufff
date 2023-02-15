import java.util.*;
public class J22019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		scan.nextLine();
		
		String day1 = scan.nextLine();
		String day2 = scan.nextLine();
		int total = 0;
		
		for (int x = 0; x < day1.length() ; x++) {
			if (day1.charAt(x) == 'C' && day2.charAt(x) == 'C') {
				total++;
			}
		}
		System.out.println(total);
	}

}

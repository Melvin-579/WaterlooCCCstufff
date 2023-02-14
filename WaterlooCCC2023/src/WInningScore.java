import java.util.*;

public class WInningScore {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	// read in the points for each team and then store each team's total score with the points system that was given
	int a3 = scan.nextInt();
	int a2 = scan.nextInt();
	int a1 = scan.nextInt();
	int aTotal = a3*3 + a2*2 + a1;
	
	int b3 = scan.nextInt();
	int b2 = scan.nextInt();
	int b1 = scan.nextInt();
	int bTotal = b3 * 3 + b2 * 2 + b1 *1;
	//compare both team's total points to determine either a winner or a tie
		if (aTotal > bTotal) {
			System.out.println("A");
	} else if (aTotal<bTotal){
		System.out.println("B");	
	} else {
		System.out.println("T");
	}
		
}
}

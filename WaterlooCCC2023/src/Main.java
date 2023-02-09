import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		//Read in the number 1-10
		int num1 = in.nextInt();
		//setup counter to 0
		int counter = 0;
		int num2;
		//if num1>5
		if (num1>5) {
			num2=num1-5;
			num1=5;
		}else {
			num2=0;
		}
		//loop while num1>=num2
		while (num1>=num2) {
			counter++;
			num1--;
			num2++;
		}
		//print counter
		System.out.println(counter);
}
}

import java.util.*;

public class J12017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int numx = scan.nextInt();
		int numy = scan.nextInt();
		
		if (numx < 0 && numy < 0 ) {
			System.out.println("3");
			
		} else if (numx>0&&numy>0){
			
			System.out.println("1");
		} else if (numx > 0 && numy < 0) {
			
			System.out.println("4");
		}else {
			
			System.out.println("2");
		}
	}

}

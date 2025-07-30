package operatorstatements;

import java.util.Scanner;

public class TernaryOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int max;
		max = (x > y) ? x : y;
		System.out.println(max);
		

	}

}

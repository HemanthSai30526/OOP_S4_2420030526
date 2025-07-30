package controlstatements;
import java.util.Scanner;

public class NotZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x;
		do {
			x=sc.nextInt();
			if(x!=0) {
				System.out.println(x);
			}
		}
		while(x!=0); {
			System.out.println("End");
		}

	}

}

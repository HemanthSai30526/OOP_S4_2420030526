package controlstatements;
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		if(x%2==0) {
			System.out.println(x+" is Even");
		}
		else {
			System.out.println(x+" is Odd");
		}

	}

}

package controlstatements;
import java.util.Scanner;

public class NegativeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		if(x<0) {
			System.out.println(x+" is Negative");
		}
		else {
			System.out.println(x+" is Positive");
		}

	}

}

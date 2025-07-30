package controlstatements;
import java.util.Scanner;

public class Marks {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		if(x>80) {
			System.out.println("A Grade");
		}
		else if(x>60 && x<=80) {
			System.out.println("B Grade");
		}
		else if(x>40 && x<=60) {
			System.out.println("C Grade");
		}
		else if(x<=40) {
			System.out.println("F Grade");
		}

	}

}

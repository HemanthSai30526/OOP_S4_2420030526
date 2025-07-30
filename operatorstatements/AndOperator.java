package operatorstatements;

import java.util.Scanner;

public class AndOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a>=35 && b>=35) {
			System.out.println("Pass");
		}
		else {
				System.out.println("Fail");
			}
		}

	}



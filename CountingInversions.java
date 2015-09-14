//Tara Moses
//Compsci Club Practice 2: Counting Inversions
//February 12, 2014

import java.util.Scanner;

public class CountingInversions {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String line;
		
		while (scan.hasNext()) {
			int num1=scan.nextInt();
			int num2=scan.nextInt();
			scan.nextLine();
			System.out.println(num1>num2?1:0);
			System.out.println();
		}
	}
}

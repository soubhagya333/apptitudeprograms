package aptiprograms.general_aptitude.primenumber;

import java.util.Scanner;

public class PrimeNumberRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		System.out.println("enter your word");
		String word = s.nextLine();
		System.out.println("enter the string");
		String msg=s.next();
		System.out.println("enter the number");
		int number = s.nextInt();
		System.out.println(word);
		System.out.println(msg);
		System.out.println(number);
		
		PrimeNumberRecursive r = new PrimeNumberRecursive();
	r.primeNumber(number);
	}
		boolean primeNumber(int number) {
			
				
			return false;
		
		}

	}



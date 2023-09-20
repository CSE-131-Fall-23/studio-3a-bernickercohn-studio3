package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		System.out.print("What do you want n to be?");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		boolean[] sieve = new boolean [n];
		for (int k = 0; k < n; k++){
			sieve[k] = true;
		}
		
		for (int i=2; i<=Math.sqrt(n); i++)
		{
		for (int j=i*2; j<n; j = j + i)
		{
			sieve[j] = false;
			
		}
		
		
		}
		
		for (int k = 2; k < n; k++){
			if (sieve[k] == true) {
				System.out.println(k);
			}
	
		
		}

	}
	
}

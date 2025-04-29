package Assignment;

import java.util.Scanner;

public class P11 {
	public static void main(String[] args) {

		int number, maximum, i, count, sum = 0; 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Maximum value: ");
		maximum = sc.nextInt();
		for(number = 0; number <= maximum; number++)
		{
			count = 0;
		    for (i = 2; i <= number/2; i++)
		    {
		    	if(number % i == 0)
		    	{
		    		count++;
		    		break;
		    	}
		    }
		    if(count == 0 && number != 1 )
		    {
                        sum = sum + number;
		    }  
		}
                System.out.println("\n The Sum of Prime Numbers = " + sum);
	}
}
	



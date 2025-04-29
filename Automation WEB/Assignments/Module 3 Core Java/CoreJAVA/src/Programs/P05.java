package Assignment;

import java.util.Scanner;

public class P05 {
	public static void main(String[] args) {
	int originalNum,digit,cubesum = 0,num;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number :");
	num = sc.nextInt();
	originalNum = num;
	
	while(num!=0) {
		digit = num%10;
		cubesum +=Math.pow(digit, 3);
		num/=10;
	}
	if(cubesum == originalNum)
        System.out.println(originalNum+ " is an Armstrong number");
    else
        System.out.println(originalNum+ " is not an Armstrong number");
	}

}

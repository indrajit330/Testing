package Assignment;

import java.util.Scanner;

public class P15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int elements = sc.nextInt();

        int [] array = new int[elements];
        int max = array[0];
        int min = array[0];

        for(int i = 0; i<elements; i++){

            System.out.print("Enter a number: ");
            array[i] = sc.nextInt();

            if(array[i]>max){
                max = array[i];

            }
            if(array[i]<min){
                min = array[i];
            }

        }

        System.out.print("The maximum number is:" + max);
        System.out.println();
        System.out.print("The minimum number is: " + min);


	}
	}


    

	



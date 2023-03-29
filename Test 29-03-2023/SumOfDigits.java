import java.util.Scanner;

public class SumOfDigits {
	public static void main(String args[]) {
		int a, d;
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter the number:");
		a = sc.nextInt();
		int sum = 0;
		while (a > 0){
			d = a%10;
			sum = d + sum;
			a = a/10;
		}
		System.out.printf("\nThe sum of digits is %d \n", sum);
	}
}

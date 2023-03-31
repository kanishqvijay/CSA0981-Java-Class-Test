import java.util.Scanner;

class Main{
	public static void main(String[] args){
		int i;
		Scanner s = new Scanner(System.in);
		System.out.printf("Enter the Number: ");
		i = s.nextInt();
		System.out.printf("The Reversed: ");
		reverseNumber(i);
	}
	static void reverseNumber(int a){
		if (a < 10){
			System.out.printf("%d\n",a);
			return;
		}
		System.out.printf("%d",a%10);
		reverseNumber(a/10);
		
	}
}
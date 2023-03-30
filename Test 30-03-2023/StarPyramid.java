import java.util.*;

public class Main {    
    public static void main(String[] args) {    
	    Scanner s = new Scanner(System.in);
	    int i,j,k,rows;
		System.out.printf("Enter no of rows:");
		rows = s.nextInt();

		for (i = 0; i < rows; i++){
			for (k=rows; k>i; k--){
				System.out.printf(" ");
			}
			for (j =0; j<i; j++){
				System.out.printf("* ");
			}
			System.out.println();
		}
    }    
}
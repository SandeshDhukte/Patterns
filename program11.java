/*
			10
		10	9
	9 	8	7
7	6	5	4
*/
import java.util.*;

class Pattern11{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number ");
		int x = sc.nextInt();
		int sum = 0;

		for(int i = 1; i <= x; i++){
			sum += i;
		}
		int n = sum;
		for(int i = 1; i <= x; i++){
			for(int k = 1; k <= (x-i); k++)
				System.out.print("\t");

			for(int j = 1; j <= i; j++){
				if(j == i){
					System.out.print(n+"\t");
				}else{
					System.out.print(n+"\t");
					n--;
				}
			}
			System.out.println();
		}
	}
}

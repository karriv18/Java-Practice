import java.util.Scanner;
public class pyramFibo{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int in = scan.nextInt();

		int sum = 0, sum1 = 1, res = 0, k = 0;

		for (int i = 0; i < in; i++){
			for(int j = in; j > i; j--){
				System.out.print(" ");
			}
			for (; k < i;){
				System.out.println(sum + " ");
				res = sum + sum1;
				sum = sum1; 
				sum = res;
				k++;
			}
			System.out.println();
		}
		scan.close();
	}
}
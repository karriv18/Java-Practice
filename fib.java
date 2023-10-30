import java.util.Scanner;
public class fib{
	public static void main(String [] args){
	int arr[] = {6,7,8, 50}; 

	Scanner scan = new Scanner(System.in);	
	
	System.out.print("Enter a number: ");
	int in = scan.nextInt();
	
	int sum1 = 0, sum2 = 1, temp = 0, i = 0, res = 0; 
	
	while(i < in){
		System.out.println(sum1 + " ");
		temp = sum1 + sum2; // will add the last 2 value
		sum2 = sum1; // will be what sum 1 value is
		sum1 = temp; 
		res = sum1; // returns the sum of the last 2 values
		i++;
	}

	 //System.out.println("The sum of the last 2 val " + res);
	}
	public static int fibo(int n){
		if (n <= 2) return 1; 
		return fibo(n - 1) + fibo(n - 2);
	}
}
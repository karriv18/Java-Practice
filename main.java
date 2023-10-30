import java.util.Scanner; 
public class main{
	public static void main(String args[]){
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter number: "); 
	int in = scan.nextInt();

	for (int i = 0; i < in; i++){

		for (int j = in; j > i; j--){
			System.out.print("*");
		}
		for (int k = 0; k <= i; k++)
		{
			System.out.print(" ");
		}

	System.out.println();
	}
	scan.close();
	}
}
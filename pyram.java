import java.util.Scanner; 
public class pyram{
	public static void main(String args[]){
	
	int sum = 0, sum2 = 1, res = 0, j = 0; 
	for (int i = 0, n = 15; i < n; i++){
		while (j < n){
			//System.out.println(sum2 + " " + res + "");
			res = sum + sum2; 
			sum2 = sum;	
			sum = res;
			j++; 
			for (int k = 0; k < j; k++){
				System.out.print(res + " " + sum);
			}
			System.out.println();
		}
	}

	}
}
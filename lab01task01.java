import java.util.Scanner;

public class lab01task01{
	
	public static void main(String args[]){
		System.out.print("Enter the number of ROWS : ");
		Scanner obj = new Scanner(System.in);
		int input = obj.nextInt();
		//System.out.println(input);
		int num = 1;
		for(int i=0;i<input;i++){
			for(int j=0;j<=i;j++){
				
				System.out.print(num );
				System.out.print("  ");
				num++;
			}
		System.out.println();
		}
	}	
}
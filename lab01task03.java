import java.util.Scanner;

public class lab01task03{ 
 
	public static void main (String[] args){  
		int rep = 1;
		int repitition = 1;
		do{
			System.out.print("Enter the 1st number : ");
			Scanner obj = new Scanner(System.in);
			int input1 = obj.nextInt();
			System.out.print("Enter the 2nd number  : ");
			//Scanner obj2 = new Scanner(System.in);
			int input2 = obj.nextInt();
			int sum=input1+input2;
			System.out.println("Entered number's ADDITION is :  " + sum);
			System.out.println("Repition :  "+ repitition );
			System.out.println();
			
			System.out.print("Type -1 for again.... :  " );
			rep = obj.nextInt();
			repitition++;
			
		}while(rep != -1);
			
    } 
		
	
}
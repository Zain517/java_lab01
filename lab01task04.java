import java.util.Scanner;

public class lab01task04{ 
 
	public static void main (String[] args){  

			int num = 0;
			int num1 = 1;
			int input = Integer.parseInt(args[0]);
			
			//System.out.println(input);
			System.out.println("Fabunacii Series  : ");
			
			if (input>1){
				System.out.print("0"+" ");
				System.out.print("1"+" ");
				for (int i = 0; i < input-2; i++){ 
				int sum = num+num1;
				System.out.print(sum+" ");
				num=num1;num1=sum;
				
				}  
			}
			else 
				System.out.print("0");
    } 
		
	
}
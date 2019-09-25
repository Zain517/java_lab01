import java.util.Scanner;

public class lab01task02{ 
 
	public static void main (String[] args){        
			System.out.print("Enter the number of array : ");
			Scanner obj = new Scanner(System.in);
			int input = obj.nextInt();
			int[] arr;  
			arr = new int[input];
			
			for (int i = 0; i < arr.length; i++){ 
					arr[i] = obj.nextInt();   
			} 
			System.out.print("Entered Array is : { " );
			for (int i = 0; i < arr.length; i++){ 
					System.out.print( arr[i] + "  ");  		   
			}    
			System.out.println(" } " );
			int even=0;int odd = 0;
			for (int i = 0; i < arr.length; i++){ 
					   
					 if(  arr[i]%2 ==0)
						even++;
					else
						odd++;	
			}  

		System.out.println("Even Elements : " + even);  
		System.out.println("Odd Elements : " + odd);  
			
			
    } 
		
	
}
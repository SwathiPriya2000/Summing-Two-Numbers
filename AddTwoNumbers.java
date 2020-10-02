import java.util.*;
public class AddTwoNumbers {

   public static void main(String[] args) {

	Scanner kb=new Scanner(System.in);
        
	int num1, num2, sum;

	System.out.print("Enter first number: "); 
	num1=kb.nextInt();

	System.out.print("Enter second number: "); 
	num2=kb.nextInt(); 

	sum=num1+num2;

	System.out.println("Sum of these numbers: "+sum);
   }
}


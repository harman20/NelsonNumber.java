import java.util.Scanner;
 
public class NelsonNumber
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    
		System.out.println("Enter a number");
		int n=in.nextInt();
		
		if(n==111 || n==222 || n==333 || n==444 ||
		   n==555 || n==666 || n==777 || n==888 || n==999){
		       System.out.println("Nelson Number");
		} else {
		    System.out.println("Not a Nelson Number");
		} 
	}
}
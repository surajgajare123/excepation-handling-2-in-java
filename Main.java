import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Exception handling ........!");
		int[] ar = new int[3];
	    ar[0] = 11;
		ar[1] = 12;
		ar[2] = 13;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array index : ");
		int a = sc.nextInt();
		System.out.println("Enter divide value : ");
		int b = sc.nextInt();
		try {
		   System.out.println("Value of index array is : "+ ar[a]);
		   System.out.println("divide value is : "+ar[a]/b);
		    
		} 
		catch(ArrayIndexOutOfBoundsException e) {
		    System.out.println(e);
		}
		catch(ArithmeticException e) {
		    System.out.println(e);
		}catch(Exception e) {
		    System.out.println("failed to divide with b ......!");
		    System.out.println(e);
		}
	}
}

import java.util.Scanner;

public class Reverse_half_triangle {

	public static void main(String[] args) {
		 
		 Scanner sc=new Scanner(System.in);
	       int n=sc.nextInt();
	       for(int i=n;i<=1;i--)
	       {
	    	   for(int j=1;j<=i;j++)
	    	   {
	    		   System.out.print(i);
	    	   }
	    	   System.out.println();
	       }
	}

}

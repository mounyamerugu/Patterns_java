import java.util.Scanner;
public class Solid_pattern_space {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int m=sc.nextInt();
	        for(int i=0;i<n;i++)
	        {
	        	for(int j=0;j<m;j++)
	        	{
	        		if(i==0 || j==0 || i==n-1 || j==m-1)
	        		{
	        		System.out.print("*");
	        		}
	        		else {
	        		System.out.print(" ");
	        		}
	        	}
	        	
	        System.out.println();
	        }
		}

	}

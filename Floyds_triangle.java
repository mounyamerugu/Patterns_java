
public class Floyds_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int n=5;
         int sum=0;
         for(int i=1;i<=n;i++)
         {
        	 for(int j=1;j<=i;j++)
        	 {
        		 sum=sum+1;
        		 System.out.print(sum);
        	 }
        	 System.out.println();
         }
	}

}

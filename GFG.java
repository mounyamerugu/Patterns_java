import java.util.Scanner;

public class GFG {
	
	static String reverseWord(String str)
	{
	    int len = str.length();
	     
	    
	    int i = 1;
	 

	    int j = str.length() - 2;
	     
	    char[] strchar = str.toCharArray();
	 
	    while (i < j)
	    {
	  
	    	  
	        char temp = strchar[i];
	        strchar[i] = strchar[j];
	        strchar[j] = temp;
	        i++;
	        j--;
	    }
	     
	    str = new String(strchar);
	    return str;
	}
	 
	
	static void reverseWords(String strs)
	{
	    String[] tok = strs.split("\\s");
	   
	    System.out.println();
	    for(String w:tok)
	    {
	 
	    
	        System.out.print(reverseWord(w) + " ");
	    }
	}
	 
	
	public static void main (String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    String str[]=new String[n];
	    for(int i=0;i<n;i++)
	    {
	    	str[i]=sc.nextLine();
	    }
	    for(int i=0;i<n;i++)
	    {
	    	 reverseWords(str[i]);
	    }
	    System.out.print(str[1]);
	    
	}
	}
		


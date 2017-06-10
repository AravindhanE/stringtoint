import java.util.*;

class stringtoint{
	public static void main (String[] args) {
	  Scanner s=new Scanner(System.in);
	  String str=s.next();
	  char c[]=str.toCharArray();
	  for(int i=0;i<str.length();i++)
	  {
	 
	
	    int b=c[i];
	    System.out.println(b); 
	  } 
	}
}

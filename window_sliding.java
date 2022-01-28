/* package codechef; // don't place package name! */
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Collections;
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	     Scanner sc=new Scanner(System.in);
	      int n=sc.nextInt();
	      int k=sc.nextInt();
	     int [] arr=new int[n];
	     for(int i=0;i<n;i++){
	         arr[i]=sc.nextInt();
	     }
	     int max=0;
	     for(int i=0;i<k;i++){
	         max+=arr[i];
	     }
	     int ws=max;
	     for(int i=k;i<n;i++){
	         ws+=arr[i]-arr[i-k];
	         max=Math.max(ws,max);
	     }
	     if(k>n)
	      System.out.println(-1);
	     else 
	       System.out.println(max);
	}
}

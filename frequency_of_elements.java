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
	    int []arr=new int[n];
	    for(int i=0;i<n;i++)
	      arr[i]=sc.nextInt();
	    HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
	    for(int i=0;i<n;i++){
	        if(map.containsKey(arr[i]))
	            map.put(arr[i],map.get(arr[i])+1);
	        else 
	            map.put(arr[i],1);
	        }
	        
	    for(HashMap.Entry entry:map.entrySet())
	       System.out.println(entry.getKey()+" "+entry.getValue());
	    }
	}


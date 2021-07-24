package webproject;
import java.util.*;
public class Example {
	 static boolean isPowerOfTwo(int x)
	    {
	        /* First x in the below expression is
	        for the case when x is 0 */
	        return x != 0 && ((x & (x - 1)) == 0);
	    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of customer: ");
		int num=sc.nextInt();
		int k=0,k1=0,k2=0,j1=0;
		int[] id=new int[num];
		int[] pri=new int[num];
		int[] pow=new int[num];
		int[] rem=new int[num];
		int[] fin=new int[num];
		for(int i=0;i<num;i++)
		{
			id[i]=sc.nextInt();
		}
		for(int i=0;i<num;i++)
		{
			 int flag=0;            
			  if(id[i]==0)
			  {  
			   //System.out.println(n+" is not prime number");
				  break;
			  }
			  else if(id[i]==1)
			  {
				   flag=1;
			  }
			  else if(isPowerOfTwo(id[i]))
				{
					int m1=id[i];
					pow[k1++]=m1;
				}	
			  else
			  {  
			   for(int j=2;j<=num;j++)
			   {      
			    if(id[i]%j!=0)
			    {      
			     //System.out.println(n+" is not prime number");      
			     flag=1;         
			    }      
			    else
			    {
			    	flag=0;
			    	int m2=id[i];
			    	rem[k2++]=m2;
			    	break;
			    }
			   }      
			   if(flag==1)  
			   { 
				   int m=id[i];
				   pri[k++]=id[i];
				   //System.out.println(id[i]+" is prime number"); 
			   }
	
			  }//end of else  
			}  
		for(int i=0;i<k;i++)
		{
			fin[j1++]=pri[i];
			//System.out.println(pri[i]);
		}
		
		for(int i=0;i<k1;i++)
		{
			fin[j1++]=pow[i];
			//System.out.println(pow[i]);
		}
		for(int i=0;i<k2;i++)
		{
			fin[j1++]=rem[i];
			//System.out.println(rem[i]);
		}
		for(int i=0;i<num;i++)
		{
			System.out.println(fin[i]);
		}
		
		}
		// TODO Auto-generated method stub

	}



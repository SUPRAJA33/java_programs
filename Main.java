import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		//your code
		Scanner sc= new Scanner(System.in);
		String arr[]={"C","S","K"},v;
		int n=sc.nextInt();
		int d=(n/3),c=(n/2)-1;
		
		for(int i=0;i<3;i++)
		{
		    v=arr[i];
		    for(int j=0;j<d;j++)
		    {
		            if(i==0 && j==0 && n==18){
		            System.out.println(".......C........");
		            c--;
		            continue;}
		        for(int k=0;k<n-1;k++)
		        {
		            if(k>=c && k<n-c-1)
		            System.out.print(v);
		            else
		            System.out.print(".");
		        }
		        System.out.println("");
		        c--;
		    }
		    c=(n/2)-1;
		}
	}
}
import java.util.Scanner;

public class XorMissing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		   int arr[] = {1,2,1,2,3,3,3,3,5};
//		    
//		    int res=arr[0];
//		        for (int i=1;i<arr.length;i++)
//		        {
//		            res = res^arr[i];
//		        }
//		        System.out.print(res);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Elements you want : ");
		int n = sc.nextInt();
		int x[] = new int[n];
		
		for (int i=0;i<n;i++)
		{
			
		    System.out.print("Enter Element "+(i+1)+" : ");
			x[i] = sc.nextInt();
		}
		
		
		for (int i=0;i<x.length;i++)
		{
			System.out.println(x[i]);
		}
		 
	}
	

}

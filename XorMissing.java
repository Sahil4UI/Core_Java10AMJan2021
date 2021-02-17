
public class XorMissing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   int arr[] = {1,2,1,2,3,3,3,3,5};
		    
		    int res=arr[0];
		        for (int i=1;i<arr.length;i++)
		        {
		            res = res^arr[i];
		        }
		        System.out.print(res);


	}

}

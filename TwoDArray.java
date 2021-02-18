
public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int x[][] = new int[2][2];
		int x[][] = {  {1,2,3} , {4,5,6} , {7,8,9}  };
		
		for(int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				if (i>=j)
					{System.out.print(x[i][j]);}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
	}

}


























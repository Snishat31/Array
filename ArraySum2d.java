package Array;

public class ArraySum2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a={{15,25,35},{45,55,65}};
		int[][] b={{12,22,32},{55,25,85}};
		
		int[][] sum=new int[2][3];
		
		for(int i=0;i<2;i++)//row
		{
			for(int j=0;j<3;j++)//col
			{
				sum[i][j]=a[i][j]+b[i][j];
				System.out.println(sum[i][j]+" ");
			}
		}
		
		
	}
}
	
	

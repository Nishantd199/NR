package arrayexample;

public class Ascendingordeofarray {
	public static void main(String[] args) {
		int a[]= {7,12,9,2};
		int size=a.length;
		for(int i=0;i<=size-1;i++)
		{
			for(int j=i+1;j<=size-1;j++)
			{
				if(a[i]<a[j])
				{
				int	temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}

			}
		for(int i=0;i<size;i++) {
			System.out.print(a[i]+ " ");
		}
}
}


	


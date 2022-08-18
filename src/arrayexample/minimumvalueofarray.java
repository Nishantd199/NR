package arrayexample;

public class minimumvalueofarray {
	public static void main(String[] args) {
		int a[]= {2,8,9,64,24,26};
		int s=a.length;
		for(int i=1;i<=s-1;i++)
		{
			for(int j=i+1;j<=s-1;j++)
			{
				if(a[i]<a[j])
				{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				{
					System.out.println(a[i]);
				}
				}
			}
		}
	}
}
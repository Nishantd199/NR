package testpackage2;

public class Forloopexample {
	
	public static void main(String[] args) {
		int a[]= {10,15,14,75,85,65,42,34,74};
		int size=a.length;
		int temp;
		for(int i=0;i<=size;i++)
		{
			for(int j=i+1;j<=size;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}System.out.println(a[i]);
			}
		}
}
}
package arrayexample;

public class maximumvalueofarray {
	public static void main(String[] args) {
		int a[]= {3,2,5,6,7};
		int maximum=a[0];
		int s=a.length;
		for(int i=1;i<s;i++)
		{
			if(a[i]>maximum)
			{
				maximum=a[i];
			}
		}
		System.out.println(maximum);
	}
	}



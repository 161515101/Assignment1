import java.util.Arrays;
public class Lab1Q4 {
	public static void main(String[] args)
	{
		int a[]= {1,2,3,4,5};
		System.out.println("The original array is: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(" "+a[i]);
		}
		int b[]=copyOf(a);
		System.out.println("The copied array is: ");
		for(int i=0;i<b.length;i++)
		{
			System.out.println(" "+b[i]);
	}
	}
public static int[] copyOf(int[] array)
{
	int b[]=Arrays.copyOf(array, array.length);
	return b;
}
}

import java.util.*;
public class Lab1Q3 {
	public static void main(String[] args)
	{
		int numStudents;
		int i=0;
		float avg=0;
		int sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of students:");
		numStudents=s.nextInt();
		int k=numStudents;
		int grades[]=new int[100];
		while(i<numStudents)
		{
			System.out.println("Enter the grade for student:");
			grades[i]=s.nextInt();
			if(grades[i]>1&&grades[i]<100)
			{
				i++;
			}
			else
			{
				System.out.println("Invalid grade, try again");
			}
		}
		for(int n=0;n<k;n++)
		{
			sum=sum+grades[n];
		}
		avg=sum/k;
		System.out.println(avg);
	}
}

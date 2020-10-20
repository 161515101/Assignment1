import java.util.*;
public class Lab1Q1 {
	public static void main(String[] args) {
		int num1=1,num2=1,num3=0,count=2;
		float avg=2;
		System.out.println(num1);
		System.out.println(num2);
		for(int i=0;i<18;i++)
		{
			num3=num1+num2;
			num1=num2;
			num2=num3;
			System.out.println(num3);
			avg=avg+num3;
			count=count+1;
		}
		avg=avg/count;
		System.out.println(avg);
	}

}

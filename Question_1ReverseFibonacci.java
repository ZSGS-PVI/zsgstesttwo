package zsgstestsecond;

import java.util.Scanner;

public class Question_1ReverseFibonacci {
	
	static int[] fabina(int sum[],int n) {
		for(int index=2;index<n;index++) {
			 sum[index]=sum[index-1]+sum[index-2];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the fibonaci limit:");
		int n=in.nextInt();
		int[] sum=new int[n];
		sum[0]=0;
		 sum[1]=1;
		 fabina(sum,n);
		for(int i=n-1;i>=0;i--) {
			System.out.print(sum[i]+" ");
		}
	}

}

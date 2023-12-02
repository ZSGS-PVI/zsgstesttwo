package zsgstestsecond;

import java.util.Scanner;

public class Question_3Array {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the length:");
		int n=in.nextInt();
		System.out.println("Enter k value:");
		int k=in.nextInt();
	System.out.println("enter the array:");
		int[] arr=new int[n];
		int count=0;
		 for(int i=0;i<n;i++) {
			 arr[i]=in.nextInt();
		 }
		 
		 for(int i=0;i<n;i++) {
			 for(int j=i+1;j<n;j++) {
				 if( (arr[i]+arr[j])%k==0) {
					 count++;
					 System.out.println("["+arr[i]+" "+arr[j]+"]");
				 }
			 }
		
		 }
		 System.out.println(count+" pairs meet the criteria");
		

	}

}

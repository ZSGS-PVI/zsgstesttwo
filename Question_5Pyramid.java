package zsgstestsecond;

import java.util.Scanner;

public class Question_5Pyramid {
	
	static void pattern(int n) {
		for(int i=1;i<=n;i++) {
			for(int s=1;s<=n-i;s++) {
				System.out.print(" ");
			}
			for(int j=1;j<i;j++) {
				System.out.print(j);
			}
			for(int k=i;k>=1;k--) {
				System.out.print(k);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      System.out.println("Enter the rows:");
      int rows=in.nextInt();
      pattern(rows);

	}

}

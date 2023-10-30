package 배열문제;

import java.util.Scanner;

public class 숫자입력배열 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			int [] arr = new int[5];
			for (int i = 0; i < arr.length; i++) {
				System.out.print("숫자입력>>");
				arr[i] = sc.nextInt();
				
			}
			     System.out.println(arr[0] + arr[2]);


		

	}

}

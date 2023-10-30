package 배열응용고급;

import java.util.Arrays;
import java.util.Scanner;

public class 배열입력저장 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int min = arr[0];
	
		int max = arr[arr.length -1];
		
		System.out.println(
				"최소값 >>  " + min + "\n" +
				"최대값 >>  " + max 
				);
	}

}

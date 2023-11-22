package 배열메서드입출력;

import java.util.Arrays;

import 배열기본.Print;

public class 배열입력값정리 {

	public static void main(String[] args) {
		int[] n = {11, 33, 55, 22, 66, 77, 88, 99,44};
			//1. 배열의 평균을 구해서 프린트
		int sum = 0;
		for (int x : n) {
			sum += x;
		}
		 int avg = sum/n.length;
		 System.out.println(avg);
		 
		 //2. 배열의 최소값을 3개를 찾아서 더해서 프린트 
		 Arrays.sort(n);
		 int min = n[0] + n[1] + n[2];
		 System.out.println(min);
		 
		 //3. 배열의 중앙값을 구해서 프린트 
		 Arrays.sort(n);
		 int mid = n[n.length/2];
		 System.out.println(mid);
		 
		 int result = 0;
		 if (n.length%2 != 0) { //   홀수인 경우) 중앙값에 10을 곱해서 프린트
			result = n[n.length/2]*10;
			System.out.println(result);
		}else { //   짝수인 경우) 중앙값들을 곱해서 프린트 
			result = n[n.length/2] * n[n.length/2 - 1];
		 	System.out.println(result);
		}
	}
}



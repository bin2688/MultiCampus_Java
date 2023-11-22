package 배열메서드입출력;

import java.util.Arrays;

public class 키큰사람구하기 {

	public static void main(String[] args) {
		Solution5 s = new Solution5();
		int[] numbers =  {0, 31, 24, 10, 1, 9};
		// int[] numbers = {1, 2, 3, 4, 5};
		int result = s.solution(numbers);
		System.out.println(result);
	}
}

class Solution5 {
	 public int solution(int[] numbers) {
		 Arrays.sort(numbers);
		int last = numbers[numbers.length - 1];
		int last2 = numbers[numbers.length - 2];
		return last * last2;
	}
}

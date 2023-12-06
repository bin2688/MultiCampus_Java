package 배열메서드입출력;

import java.util.Arrays;

public class 최댓값만들기2 {

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		//int[] numbers =  {0, -31, 24, 10, 1, 9};
		 int[] numbers = {1, 2, -3, 4, -5};
		int result = s.solution(numbers);
		System.out.println(result);
	}
}

class Solution2 {
	 public int solution(int[] numbers) {
		 Arrays.sort(numbers);
			if (numbers[0] * numbers[1] > numbers[numbers.length-1] * numbers[numbers.length-2]) {
				return numbers[0] * numbers[1];
			}else {
				return numbers[numbers.length-1] * numbers[numbers.length-2];
			}

	}
}

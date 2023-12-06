package 배열메서드입출력;

import 배열기본.Print;

public class 아메리카노값 {

	public static void main(String[] args) {
		Solution8 s = new Solution8();
		int[] result = s.solution(10000);
		Print.arrayPrint(result);
	}
}

class Solution8 {
	 public int[] solution(int money) {
		int[] answer = {0,0};
		answer[0] = money/5500;
		answer[1] = money%5500;
		return answer;
	}
}

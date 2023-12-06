package 배열컬렉션변환;



import 배열기본.Print;

public class 배열자르기 {

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		int[] numbers = {1,2,3,4,5};
		int num1 = 1;
		int num2 = 3;
		int[] result = s.solution(numbers, num1, num2);
		Print.arrayPrint(result);
	}
}

class Solution2 {
	public int[] solution(int[] numbers, int num1, int num2) { //배열 나누어지는 수
		//int[] answer = Arrays.copyOfRange(numbers, num1, num2 + 1);
		
		int[] answer = new int[num2 - num1 + 1];
		int index = 0;
		for (int i = num1; i < num2 +1 ; i++) {
			answer[index++] = numbers[i];
		}
    	return answer;
	}
}


package 배열메서드입출력;

import 배열기본.Print;

public class 홀수짝수개수 {

	public static void main(String[] args) {
		Solution9 s = new Solution9();
		int[] num_list = {1, 2, 3, 4, 5};
		//int[] num_list = {1, 3, 5, 7};
		int[] result = s.solution(num_list);
		Print.arrayPrint(result);
	}
}

class Solution9 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];

        for(int i = 0; i < num_list.length; i++)
            answer[num_list[i] % 2]++;

        return answer;
    }
}

/*
 * class Solution9 { public int[] solution(int[] num_list) { int[] answer =
 * {0,0}; for (int x : num_list) { if (x%2 == 0) { answer[0]++; }else{
 * answer[1]++; } } return answer; } }
 */


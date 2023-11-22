package 배열메서드입출력;

import 배열기본.Print;

public class 배열원소길이 {

	public static void main(String[] args) {
		Solution10 s = new Solution10();
		String[] strlist = {"We", "are", "the", "world!"};
		//String[] strlist = {"I", "Love", "Programmers."};
		int[] result = s.solution(strlist);
		Print.arrayPrint(result);
	}
}

class Solution10 {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for (int i = 0; i < answer.length; i++) {
			answer[i] = strlist[i].length();
		}

        return answer;
    }
}

/*
 * class Solution9 { public int[] solution(int[] num_list) { int[] answer =
 * {0,0}; for (int x : num_list) { if (x%2 == 0) { answer[0]++; }else{
 * answer[1]++; } } return answer; } }
 */


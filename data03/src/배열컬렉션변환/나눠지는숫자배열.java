package 배열컬렉션변환;

import java.util.ArrayList;
import java.util.Arrays;

import 배열기본.Print;

public class 나눠지는숫자배열 {

	public static void main(String[] args) {
		Solution1 s = new Solution1();
		int[] n = {5,9,7,10};
		int div = 5;

		int[] result = s.solution(n,5);
		Print.arrayPrint(result);
	}
}

class Solution1 {
    public int[] solution(int[] n, int div) { //배열 나누어지는 수
    	Arrays.sort(n);
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	for (Integer x : n) {
			if (x%div == 0) { //div의 배수
				list.add(x);
			}
		}
    	//모은후,개수세기
    	int size = list.size();
    	int[] answer = null;
    	if (size == 0) {
    		answer = new int[1];
			answer[0] = -1;
		}else {
			//list에서 꺼내서 배열에 넣기
			answer = new int[size];
			for (int i = 0; i < answer.length; i++) {
				answer[i] = list.get(i);
			}
		}
			
    	return answer;
	}
}


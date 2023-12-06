package 문자열관련;

import java.util.Arrays;

public class A로B만들기 {

	public static void main(String[] args) {
		String before = "pepp";
		String after = "pppe";
		
		Solution12 s = new Solution12();
		int result = s.solution(before,after);
		System.out.println(result);
	}
}

class Solution12 {
	 public int solution(String before, String after) {
		 	int	answer = 0;
		 	char[] b = before.toCharArray();
		 	char[] a = after.toCharArray();
		 	Arrays.sort(b);
		 	Arrays.sort(a);
		 	if (Arrays.equals(a, b)) {
				answer = 1;
			}
	        return answer;
	    }
}

package 프로그래머스_입문;

import java.util.Arrays;
import java.util.Stack;

public class 올바른괄호 {

	public static void main(String[] args) {
		Solution1 sol = new Solution1();
		String s = "()()";
		boolean result = sol.solution(s);
		System.out.println(result);
	}
}

class Solution1 {
	 boolean solution(String s) {
	        boolean answer = false;
	        Stack<Character> stack = new Stack<>();
	        try {
				for (int i = 0; i < s.length(); i++) {
					if (s.charAt(i)=='(') {
						stack.push('(');
					}else {
						stack.pop();
					}
				}
				answer = stack.empty();
			} catch (Exception e) {
				answer = false;
			}
	        return answer;
	}
}

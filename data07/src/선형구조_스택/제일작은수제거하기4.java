package 선형구조_스택;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class 제일작은수제거하기4 {

	public static void main(String[] args) {

		int[] n = { 500, 400, 200, 300, 900 };
		Arrays.sort(n);
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < n.length; i++) {
			stack.push(n[i]);
		}
		stack.remove(stack.peek());
		System.out.println(stack);
		int[] answer = new int[stack.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = stack.pop();
		}
		System.out.println(Arrays.toString(answer));
	}
}
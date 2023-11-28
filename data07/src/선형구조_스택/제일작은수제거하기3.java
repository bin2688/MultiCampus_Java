package 선형구조_스택;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class 제일작은수제거하기3 {

	public static void main(String[] args) {
		int[] n = {4, 3, 2, 1, 5};
		Arrays.sort(n);
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < n.length; i++) {
			stack.push(n[i]);
		}
		System.out.println(stack);
		int[] answer = new int[n.length - 1];
		for (int i = answer.length-1; i >= 0; i--) { //역순으로 꺼내기
			answer[i] = stack.pop();
		}
		System.out.println(Arrays.toString(answer));
	}

}
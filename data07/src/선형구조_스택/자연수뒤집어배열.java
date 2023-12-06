package 선형구조_스택;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class 자연수뒤집어배열 {

	public static void main(String[] args) {
		int[] n = {1, 2, 3, 4, 5};
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < n.length; i++) {
			stack.push(n[i]);
		}
		int[] answer = new int[stack.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = stack.pop();
		}
		
		System.out.println(Arrays.toString(answer));
	}
}


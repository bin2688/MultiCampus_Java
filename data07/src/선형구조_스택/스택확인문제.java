package 선형구조_스택;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class 스택확인문제 {

	public static void main(String[] args) {
		String[] food = {"apple", "apple", "apple", "banana", "banana", "melon", "melon", "berry"}; 
		Stack<String> stack = new Stack<String>();
		stack.push(food[0]);
		String s = "";
		for (int i = 0; i < food.length; i++) {
			if (stack.peek() != food[i]) {
				stack.push(food[i]);
			}else {
				if (!s.contains(food[i])) {
					s += food[i] + " ";
				}
			}
		}	
		System.out.println("음식종류>> " + stack);
		System.out.println("중복된음식종류>> " + s);

		
		
		
		
	}
}


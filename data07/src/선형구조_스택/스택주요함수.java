package 선형구조_스택;

import java.util.Stack;

public class 스택주요함수 {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>(); //toString() 오버라이드 되있음
		stack.push("홍길동");
		stack.push("김길동");
		stack.push("송길동");
		stack.push("정길동");
		System.out.println(stack);
		System.out.println(stack.get(0));
		System.out.println(stack.pop()); //뺀 값을 보여줌(remove)
		System.out.println(stack);
		System.out.println(stack.contains("김길동"));
		System.out.println(stack.peek()); //맨 마지막에 넣은값 확인 (find)
		System.out.println(stack.indexOf("김길동")); //boolean값을 0이나 1로 출력
		System.out.println(stack.set(0, "파이팅")); //바꿔지기 전 값을 보여줌
		
		
		for (int i = 0; i < stack.size(); i++) {
			System.out.println(i + ":" + stack.get(i));
		}
		for (String s : stack) {
			System.out.println(s);
		}
		
		System.out.println(stack.firstElement());
		System.out.println(stack.lastElement());
		
		stack.clear(); // 스택을 비워줌
		System.out.println(stack);
		
		
		
		
		
	}

}

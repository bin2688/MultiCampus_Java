package 제어문.순차문;

import java.util.Scanner;

public class 스캐너연습 {

	public static void main(String[] args) {
		//콘솔창에 직접 입력방법 (코딩테스트에 씀)
		Scanner sc = new Scanner(System.in);
		
		 System.out.print("이름 입력>>");
		
		 String name = sc.next(); //String으로 입력한 값을 가지고 들어온다.
		 
		 
		 System.out.println("당신의 이름은" + name);
		 
		 System.out.print("나이 입력>>");
		 int age = sc.nextInt(); //모든 입력은 string > int로 변경해줌
		 System.out.println("당신의 나이는" + (age + 1));
		 
		 System.out.print("몸무게 입력>>");
		 double w = sc.nextDouble(); 
		 System.out.println("당신의 몸무게는" + (w - 10));
	}

}

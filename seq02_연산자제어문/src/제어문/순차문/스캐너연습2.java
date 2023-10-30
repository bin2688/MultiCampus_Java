package 제어문.순차문;

import java.util.Scanner;

public class 스캐너연습2 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("이름 입력>> ");
			String name = sc.next();
			
			System.out.print("키 입력>> ");
			double h = sc.nextDouble(); 
			System.out.print("몸무게 입력>> ");
			double w = sc.nextDouble(); 
			System.out.print("저녁 여부 입력>> ");
			boolean food = sc.nextBoolean();
			System.out.print("좌우명 입력>> ");
			sc.nextLine();
			String life = sc.nextLine();
			
			System.out.println("당신의 이름은 " + name);
			System.out.println("당신의 내년 키는  " + (h + 10));
			System.out.println("당신의 내년 몸무게는  " + (w - 10));
			System.out.println("저녁 여부는   " + food);
			System.out.println("당신의 좌우명은 " + life);

	}

}

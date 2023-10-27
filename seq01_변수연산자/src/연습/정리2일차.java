package 연습;

import javax.swing.JOptionPane;

public class 정리2일차 {

	public static void main(String[] args) {
		//1번 문제
		String weight = JOptionPane.showInputDialog("몸무게 입력");
		String height = JOptionPane.showInputDialog("키 입력");

		int bmi = Integer.parseInt(weight) / (Integer.parseInt(height) * Integer.parseInt(height)) ;

		System.out.println(bmi);
		System.out.println("1----------------");

		// 2번문제
		String point = "3000";
		double plus = 33.3;
		double pinpoint = Double.parseDouble(point);

		double result = pinpoint + plus;
		
		System.out.println(result);
		System.out.println("2----------------");
		
		
		//스샷 1번 문제
		int n = 10;
		int m = 20;
		
		System.out.println(n + m);
		System.out.println(n - m);
		System.out.println(n * m);
		System.out.println(n / m);
		System.out.println("3----------------");
		
		//스샷 1번 문제
		String t = JOptionPane.showInputDialog("현재온도는");
		double result1 = Double.parseDouble(t);
		
		if(result1 >= 25) {
			System.out.println("너무 더워요");
		} else {
			System.out.println("괜찮아요.");
		}
		System.out.println("4----------------");

		
		
		
		// 기본데이터 + 연산자 3번문제
		int wprice = 1000;
		int wcount = 2;
		int iprice = 2000;
		int icount = 3;
		
		int water = wprice*wcount;
		int ice = iprice*icount;
		
		int total = water + ice;
		
		System.out.println(total);
		System.out.println("5----------------");
		

	}
}

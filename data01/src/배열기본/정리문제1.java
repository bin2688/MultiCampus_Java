package 배열기본;

import java.util.Random;
import java.util.Scanner;

public class 정리문제1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] number = new int[5];
		
		for (int i = 0; i < number.length; i++) {
			number[i] = sc.nextInt();	
		}
		
		int min = number[0];
		for (int x : number) {			
			if (x < min) {
				min = x;
			}	
		}
		Print.arrayPrint(number);
		System.out.println(min);
		System.out.println("-------1번끝------------");
		
		Random r = new Random();
		int[] number2 = new int[20];
		
		for (int i = 0; i < number2.length; i++) {
			number2[i] = r.nextInt(900);
		}
		
		
		
		
	}
}

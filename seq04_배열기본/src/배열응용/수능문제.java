package 배열응용;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 수능문제 {

	public static void main(String[] args) {
		int[] jumsu = new int[10000];
		Random r = new Random();

		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(451);
		}
		// System.out.println(Arrays.toString(jumsu));
		System.out.println("====================");

		int sum = 0;
		for (int x : jumsu) {
			sum = sum + x;
		}
		System.out.println("평균은" + (double) sum / jumsu.length);

		// 최댓값, 최소값??
		// 오름차순으로 정렬해보자!
		// cpu가 ram의 값을 변경해버림 ==> 파괴형 함수
		Arrays.sort(jumsu); // 램에 들어있는 10000개의 데이터를 위치를 옮겨 정렬해줌!

		String data = "100";
		// cpu가 ram의 값을 변경하지 않는다(85%) ==> 비파괴형 함수
		int data2 = Integer.parseInt(data);

		// Arrays.toString(jumsu); ==> 비파괴형
		// double.paseDouble(data) ==> 비파괴형
		System.out.println(Arrays.toString(jumsu));
		int min = jumsu[0];
		int max = jumsu[jumsu.length - 1];
		System.out.println("최소값>>" + min);
		System.out.println("최대값>>" + max);
		
		//점수가 최소값인 사람의 수, 점수가 맥스인 사람의 수
		//배열을 순서대로 순회해서 데이터 접근
		
	//	int minCount = 0, maxCount = 0;
		
	//	for (int i = 0; i < jumsu.length; i++) {
	//		if(jumsu[i] == min) {
	//			minCount++;
	//		} else if(jumsu[i] == max) {
	//			maxCount++;				
	//		}
		//	System.out.println("최소값의 인원수 >>" +  minCount);
		//	System.out.println("최대값의 인원수 >>" +  maxCount);
		//	System.out.println("======================");
			
			//300점 이상인 사람의 수 카운트
			
			int thirdCount = 0;
			for (int i = 0; i < jumsu.length; i++) {
				if(jumsu[i] >= 300) {
					thirdCount++;
				}
				
			}
			System.out.println(thirdCount);
		}
	}



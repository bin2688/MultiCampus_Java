package 비선형구조;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class k번째수 {
	
	public static void main(String[] args) {
		int[] num = { 1, 5, 2, 6, 3, 7, 4};
		
		//1. num배열에서 2~5번째 (인덱스1~4)까지 추출
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 4; i++) {
			list.add(num[i]);
		}
		System.out.println(list);
		
		//2. 정렬
		Collections.sort(list);
		System.out.println(list);
		
		//3. 원하는 위치값 추출
		System.out.println(list.get(2));
		
		
		
		
		
		int[][] commands = {
				{2, 5, 3},
				{4, 4, 1},
				{1, 7, 3}
		};
		int[] answer = new int[commands.length];
		for (int i = 0; i < commands.length; i++) {
			int start = commands[i][0] - 1;
			int end = commands[i][1] - 1;
			int find = commands[i][2] - 1;
			ArrayList<Integer> list2 = new ArrayList<>();
			for (int j = start; j <= end; j++) {
					list2.add(num[j]);
			}
			System.out.println(list2);
			
			//2. 정렬
			Collections.sort(list2);
			System.out.println(list2);
			
			//3. 원하는 위치값 추출
			System.out.println(list2.get(find));
			answer[i] = list2.get(find);
		}

		System.out.println(Arrays.toString(answer));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

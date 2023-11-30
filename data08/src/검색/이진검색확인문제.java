package 검색;

import java.util.Arrays;

public class 이진검색확인문제 {

	public static void main(String[] args) {
		int[] num = {1, 4, 5, 2, 7, 8, 9, 6};
		int[] search = {1, 7, 6};
		// int[] search = {1, 7, 6}; 오름차순 후 위치 찾아서 "-인덱스-인덱스 -인덱스"프린트
		// StringBuilder 사용
		
		Arrays.sort(num);
		StringBuilder sb = new StringBuilder();
		for (int find : search) {
			sb.append("-" + Arrays.binarySearch(num, find)); //골라서 넣음
		}
		System.out.println(sb);
		String answer = sb.toString();
		System.out.println(answer);

	}

}

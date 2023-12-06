package 배열기본;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열결과리스트에넣기 {

	public static void main(String[] args) {
		int[] n = {100, 200, 300, 400, 500};
		//1. 전체목록 프린트
		Print.arrayPrint(n);
		
		
		int count = 0;
	    ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n.length; i++) {
			if (n[i] >= 300) {
				count++;
				list.add(i);
			}
			
		}
		//2, 300이상 값이 몇 개 인지 카운트해서 프린트
		System.out.println(count);
		
		//3. 300이상 들어있는 위치를 arraylist에 모으기
		System.out.println(list);
		
		//4. arraylist안 인덱스에 배열의 값들에서 100만큼 빼기.
		for (int i = 0; i < list.size(); i++) {
			int index = list.get(i);
			n[index] =  n[index] - 100;
			//n[i] = n[i] - 100;
			//== n[index] -= 100;
		}

		//5. 수정된 배열 전체 프린트
		Print.arrayPrint(n);

	}

}

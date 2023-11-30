package 정렬;

import java.util.Arrays;

public class SwapTest_자리바꾸기 {

	public static void main(String[] args) {
		int[] num = {6, 1, 2, 3, 5, 9};
		System.out.println(Arrays.toString(num));
		
		int temp = num[1];
		num[1] = num[0];
		num[0] = temp;
		//코드를 한줄씩 처리하기 때문에 단순히 서로 값을 넣는다고 swap이안됨.
		//하기 위해선 swap전에 백업해두어야함
		System.out.println(Arrays.toString(num));
	}

}

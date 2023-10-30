package 메서드활용;

import java.util.ArrayList;
import java.util.HashSet;

public class 내카페5 {

	public static void main(String[] args) {
		int[] num = { 1, 3, 4, 5, 7, 8, 2, 2, 4, 5, 6, 9 };
		Cal5 cal5 = new Cal5();
		ArrayList list = cal5.getEven(num);
		System.out.println(list);
		
		ArrayList list2 = cal5.getOdd(num);
		System.out.println(list2);
		
		HashSet list3 = cal5.getUnique(num);
		System.out.println(list3);
	}
}

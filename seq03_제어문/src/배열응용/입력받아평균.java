package 배열응용;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class 입력받아평균 {

	public static void main(String[] args) {
		
		int[] n3 = new int[3]; // {0, 0, 0,}
		
		for (int i = 0; i < 3; i++) {
			// 입력 5개 받아서 > 저장 > 꺼내서 누적연산
			String n = JOptionPane.showInputDialog("숫자입력");
			//입력한 값을 String으로 프로그램 안으로 가지고 오는 것 까지.
			n3[i] = Integer.parseInt(n);
		}
		
		//출력! > 내용만 확인 가능
		//String list = Arrays.toString(n3);
		//System.out.println(list);
		System.out.println(Arrays.toString(n3));
		
		
		int sum = 0;
		for (int x : n3) {
			sum = sum + x;
		}
		
//		for (int i = 0; i < n3.length; i++) {
//			sum = sum + n3[i];
//		}
		System.out.println((double)sum / n3.length);
	}

}

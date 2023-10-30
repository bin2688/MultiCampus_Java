package 배열응용;

import java.util.Arrays;

public class 참조형복사 {

	public static void main(String[] args) {
		int [] n1 = {100, 200 ,300};
		int [] n2 = n1; //얕은 복사, 주소만 복사 (이렇게하면 안됨 - 같은 주소 값들이 다바뀌어버림)
		int [] n3 = n1.clone(); //깊은 복사, 주소 안에 값들을 복사 (권장)
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		
		
		n2[0] = 999;
		System.out.println(Arrays.toString(n1));
		System.out.println(Arrays.toString(n2));
		
		n3[0] = 888;
		System.out.println(Arrays.toString(n1));
		System.out.println(Arrays.toString(n3));
		
	}

}

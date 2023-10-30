package 배열문제;

import java.util.Arrays;

public class 저장공간문제2 {

	public static void main(String[] args) {
		double [] d = new double[300];
		
		d[0] = 10.1;
		d[1] = 20.2;
		d[d.length -1] = 50.5;

		for (double e : d) {
			System.out.println(Arrays.toString(d));
			//그냥 배열 보려면 Arrays.toString()넣기
			//배열을 스트링으로 만들어줌
		}
	}

}

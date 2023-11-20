package 배열기본;

import java.util.Arrays;

public class 배열확인 {

	public static void main(String[] args) {
		//배열(array)은 많은 양의 데이터를 다루기 위한 자료구조
		//배열을 만드는 두 가지 방법
		//1. 이미 값들을 알고 있는 경우
		// - 선형으로 쭉 값들을 집어 넣음.
		int[] ages = {60, 50, 30 ,20, 10};
		System.out.println(ages);
		System.out.println(ages.length);
		System.out.println(ages[0]);
		ages[1] = 55;
		System.out.println(ages[1]);
		//for/ 위치를 나타내는 i / 값 출력용 + 입력용 / 활용범위가 넓다
		for (int i = 0; i < ages.length; i++) {
			System.out.println(ages[i]);
		}
		//for-each / 값을 저장할 변수명 x / 값 '출력용'만 / 간단하다
		for (int x : ages) {
			System.out.println(x);
		}
		
		System.out.println(Arrays.toString(ages)); //배열찍으면 주소로나옴, 인덱스값을 보기 위해서 toString으로 변환
		
		//2. 아직 값들을 모르는 경우
		// - 저장구조를 먼저 만들고 값들을 나중에 집어 넣음.
		double[] weight = new double[5]; // {0.0,0.0,0.0,...}; == 배열은 자동초기화까지 해준다.
		
		weight[0] = 88.8;
		weight[1] = 88.7;
		weight[2] = 88.6;
		weight[3] = 88.5;
		weight[4] = 88.4;
		
		for (double d : weight) {
			System.out.println(d);
		}
		System.out.println(Arrays.toString(weight));
	}

}

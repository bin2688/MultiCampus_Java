package 배열기본;


public class 배열만들기 {

	public static void main(String[] args) {
		// 1. 배열 만들때 기준 - 값을 모르고 있는 경우
		int[] arr = new int [5]; //자동 초기화{0,0,0,0,0}
		
		arr[0] = 100;
		arr[2] = 200;
		arr[4] = 300;
		
		// 2. 배열 만들 때 기준 - 값을 이미 알고 있는 경우
		int[] s2 = {1, 2, 3, 4, 5};
		
		
		//s와 s2의 개수(사이즈 size, 길이 length)를 프린트
		System.out.println(s2.length);
		System.out.println(arr.length);
		
		System.out.println(arr[0]);
		System.out.println(arr[2]);
		System.out.println(arr[4]); // or System.out.println(s[s.length - 1]);
		
		System.out.println(arr[0] + arr[2]);
		
		System.out.println(arr[0] == arr[2]);
		
		//for문은 주로 출력용으로만
		for (int x : arr) {
			System.out.println(x);
		}
		
	}

}

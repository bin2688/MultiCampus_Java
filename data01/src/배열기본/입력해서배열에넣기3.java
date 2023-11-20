package 배열기본;

import java.util.Arrays;
import java.util.Scanner;

public class 입력해서배열에넣기3 {

	public static void main(String[] args) {
		//입력하는 개체 필요 Scanner
		//많은 양의 데이터를 선형으로 넣을 수 있는 객체
		//배열을 사용
		Scanner sc = new Scanner(System.in);
		double[] numbers = new double[5];
		//numbers --> {0,0,0} + length
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("숫자입력 >>");
			numbers[i] = sc.nextDouble();
		}
		sc.close(); //스트림 통로닫기.
		System.out.println(Arrays.toString(numbers));
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 22.2) {
				System.out.println("22.2의 위치는 >>" + i);
			}else if (numbers[i] == 33.3) { //else일 때 더이상 다른것은 체크하지 않을경우 else if <> 모두 실행하고 싶을땐 각각 if절
				System.out.println("33.3의 위치는 >>" + i);
			}
		}
	}

}

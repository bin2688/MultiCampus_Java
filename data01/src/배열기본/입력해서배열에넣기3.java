package 배열기본;

import java.util.ArrayList;
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
			numbers[i] = sc.nextDouble();
		}
		sc.close(); //스트림 통로닫기.
		System.out.println(Arrays.toString(numbers));
		
		int count = 0;
		String location = "";
		ArrayList<Integer> list = new ArrayList<Integer>(); //모아 놓고 배열에 집어넣기.
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 22.2) {
				System.out.println("22.2의 위치는 >>" + i);
			}else if (numbers[i] == 33.3) { //else일 때 더이상 다른것은 체크하지 않을경우 else if <> 모두 실행하고 싶을땐 각각 if절
				System.out.println("33.3의 위치는 >>" + i);
				count++;
				location = location + i + " ";
				list.add(i);
			}
		}
		System.out.println(count);
		System.out.println("33.3의 위치는 " + location);
		System.out.println(list);
		
		//list안에 있는 인덱스에 333.3을 넣어보기
		for (int i = 0; i < list.size(); i++) {
			//2,3
			int index = list.get(i); //2
			numbers[index] = 333.3;
		}
		System.out.println(Arrays.toString(numbers));
		//List<double[]> list = Arrays.asList(numbers);
	}
}

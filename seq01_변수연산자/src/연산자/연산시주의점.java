package 연산자;

public class 연산시주의점 {

	public static void main(String[] args) {
		
		int n1 = 5;
		int n2 = 4;
		
		int sum = n1 + n2;
		//자바의 연산시 정수와 정수 연산은 무조건 정수!!!
		int avg = sum / 2;
		//자바의 연산시 하나라도 실수이면 무조건 실수!!!
		
		System.out.println(avg);
		
		System.out.println("----------");
		
		
		//double avg2 = sum / 2.0;
		// 소수점을 구하고싶으면  정수를 실수로  바꿔서 연산
		
		double avg2 = (double)sum / 2;  //강제 타입변환, 강제 형변환  >>> 간단하게 괄호로 바꿀수 있는건 기본데이터타입만 !!!!
		//변수선언은 타입절대고정 정수 > 실수 연산과정은 cpu가 처리하고 ram에 다시 저장
		
		System.out.println(avg2);

	}

}

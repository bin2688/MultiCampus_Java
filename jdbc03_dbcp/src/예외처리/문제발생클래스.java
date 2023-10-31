package 예외처리;

public class 문제발생클래스 {

	public static void main(String[] args) {
		System.out.println("1. 나는 실행됨.");
		
			try {
				//System.out.println("2. 0으로 나누기>>" + 10/0);
				int[] arr = {1, 2 ,3};
				System.out.println(arr[3]);
			} catch (ArithmeticException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				System.out.println("수학연산 에러 발생함.");
			} catch (ArrayIndexOutOfBoundsException e2) {
				e2.printStackTrace();
				System.out.println("배열 인덱스 에러 발생함.");
			} catch (Exception e) { //else같은거
				System.out.println("기타 에러 발생함.");
				
			}
			//try/catch는 조그만범위부터 써야함 (디테일한거부터 잡아야해서)
		
			System.out.println("3. 여기는 프린트 될까요??");

	}

}

package 예외처리;

public class 문제발생클래스3 {

	public static void main(String[] args) {
		System.out.println("1. 나는 실행됨.");
		try {
			System.out.println("2. 0으로 나누기>>" + 10/0);
			int[] arr = {1, 2 ,3};
			System.out.println(arr[3]);
		} catch (Exception e) {
			e.printStackTrace(); // 주석으로 막으면 에러정보는 안나옴.
			//서버관리자에게 이메일보내는 처리, 문자, git history처리, jira history 처리
			System.out.println("0으로 나누는 것은 실패");
		}
		System.out.println("3. 여기는 프린트 될까요??");

	}

}

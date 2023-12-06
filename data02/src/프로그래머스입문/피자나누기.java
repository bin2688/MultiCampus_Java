package 프로그래머스입문;

public class 피자나누기 {

	public static void main(String[] args) {
		Solution6 s = new Solution6();
		int result = s.solution(6); // 
		System.out.println(result);
	}

}

class Solution6 {
	//n = 양꼬치주문수, k = 음료주문개수
	public int solution(int n) {
		int answer = 1;
	    int slice= n/7;
	    answer = answer + slice;
	    System.out.println(answer);
		return answer;
	}
}

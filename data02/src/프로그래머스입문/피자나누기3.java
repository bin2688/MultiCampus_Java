package 프로그래머스입문;

public class 피자나누기3 {

	public static void main(String[] args) {
		Solution7 s = new Solution7();
		int result = s.solution(4, 43); //슬라이스수, 사람수  
		System.out.println(result);
	}

}

class Solution7 {
	//n = 방문 사람수 
	public int solution(int slice, int n) {
		int answer = 0;
		if (n < slice) { //4,5 < 7
			answer = 1;
		}if (n % slice == 0) { //7, 14, 21
			answer = n / slice;
		} else { //8, 9, 71(10판 + 1판)
			answer = n / slice + 1;
		}
		//피자 몇 조각이 필요할까요??
		return answer;
	}
}

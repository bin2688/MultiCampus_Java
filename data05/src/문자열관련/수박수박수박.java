package 문자열관련;



public class 수박수박수박 {

	public static void main(String[] args) {
		Solution7 s = new Solution7();
		int n = 2;
		String result = s.solution(n);
		System.out.println(result);
	}
}

class Solution7 {
	public String solution(int x) {
		String answer = "";
		for (int i = 0; i < x; i++) {
			if (i%2 == 0) {
				answer += "수";
			}else {
				answer += "박";
			}
		}
		return answer;
	}
}

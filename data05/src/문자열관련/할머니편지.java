package 문자열관련;

public class 할머니편지 {

	public static void main(String[] args) {
		Solution8 s = new Solution8();
		String n = "happy birthday!";
		int result = s.solution(n);
		System.out.println(result);
	}
}

class Solution8 {
	public int solution(String n) {
		int answer = n.length() * 2;
		return answer;
	}
}	
package 문자열관련;


public class 문자반복출력하기 {

	public static void main(String[] args) {
		Solution10 s = new Solution10();
		String my_string = "hello";
		int n = 3;
		String result = s.solution(my_string, n);
		System.out.println(result);
	}
}

class Solution10 {
	 public String solution(String my_string, int n) {
	        String answer = "";
	        char[] c = my_string.toCharArray();
	        for (char x : c) {
				for (int i = 0; i < n; i++) {
					answer += x;
				}
			}
	        return answer;
	}
}

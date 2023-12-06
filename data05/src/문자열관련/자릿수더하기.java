package 문자열관련;



public class 자릿수더하기 {

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		int n = 1234;
		int result = s.solution(n);
		System.out.println(result);
	}
}

class Solution2 {
	public int solution(int n) {
		int answer = 0;
		String s = String.valueOf(n);
		//1. char로 분리 ==> 아스키코드를 고려
		//c = {'1', '2', '3', '4'};
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			answer = answer + c[i] - '0';
		}
		
		//2. String으로 분리 (이게 더편함 but 성능 낮음)
		//s2 = {"1", "2", "3", "4"};
		//String[] s2 = s.split("");
		
//		for (int i = 0; i < s2.length; i++) {
//			int x = Integer.parseInt(s2[i]);
//			answer = answer + x;
//		}

        return answer;
    
	}
}

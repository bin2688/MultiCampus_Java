package 문자열관련;

import java.util.Arrays;


public class 문자열내림차순 {

	public static void main(String[] args) {
		Solution4 s = new Solution4();
		String s2 = "asdwdqZWQ";
		String result = s.solution(s2);
		System.out.println(result);
	}
}

class Solution4 {
	public String solution(String s) {
		//String --> char[]
	char[] c = s.toCharArray();
	Arrays.sort(c);//오름차순 
	//char[] --> String
	String x = new String(c);
	//String s2 = c.toString(); 대괄호때문에 안됨
	String answer = new StringBuilder(x).reverse().toString();
	return answer;
	}
}

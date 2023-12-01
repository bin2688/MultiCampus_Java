package 프로그래머스_입문;


public class 문자열섞기 {

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		String str1 = "aaaaa";
		String str2 = "bbbbb";
		String result = s.solution(str1,str2);
		System.out.println(result);
	}
}

class Solution2 {
	 public String solution(String str1, String str2) {
	        String answer = "";
	        for(int i=0; i<=str1.length()-1; i++){
	            answer += String.valueOf(str1.charAt(i)) + String.valueOf(str2.charAt(i));
	        }
	        return answer;

	    }
}

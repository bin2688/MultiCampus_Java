package 문자열관련;

import java.util.Arrays;
import java.util.List;

public class 서울에서김서방 {

	public static void main(String[] args) {
		Solution6 s = new Solution6();
		String[] seoul = {"Jane", "Kim"};
		String result = s.solution(seoul);
		System.out.println(result);
	}
}

class Solution6 {
	public String solution(String[] seoul) {
        List<String> list = Arrays.asList(seoul);
        String answer = "김서방은" + list.indexOf("Kim") + "에 있다";  
        return answer;
	}
}

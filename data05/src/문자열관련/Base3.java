package 문자열관련;


public class Base3 {

	public static void main(String[] args) {
		Solution1 s = new Solution1();
		int num = 232443997;
		int k = 7;
		int result = s.solution(num, k);
		System.out.println(result);
	}
}

class Solution1 {
	public int solution(int num, int k) {
        String s = String.valueOf(num);
        String k2 = String.valueOf(k);
        int index = s.indexOf(k2);
        int answer = -1;
        if (s.contains(k2)) {
			answer = index + 1;
		}
        return answer;
    
	}
}

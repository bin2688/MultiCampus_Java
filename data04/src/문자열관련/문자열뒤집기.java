package 문자열관련;

public class 문자열뒤집기 {

	public static void main(String[] args) {

		String s = "감자고구마양파"; //스트링으로 변환
		String s2 = "";
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(1));
		for (int i = s.length()-1; i >= 0; i--) {
			s2 = s2 + s.charAt(i);
		}
		
		System.out.println(s2);
		
		
	}
}

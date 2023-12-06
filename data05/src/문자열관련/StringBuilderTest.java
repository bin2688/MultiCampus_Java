package 문자열관련;

public class StringBuilderTest {

	public static void main(String[] args) {
		String s = "pongpong";
		String s2 = "pongpong";
		System.out.println(s == s2); //주소비교
		System.out.println(s.equals(s2)); //값비교
		s2 = "hahaha";
		System.out.println(s == s2); 
		System.out.println(s.equals(s2)); 
		//값이 동일하면 같은 주소를 가르킨다.
		//String의 값이 자주 변경하면 String은 비효율적이다.
		
		StringBuilder sb = new StringBuilder("pongpong");
		StringBuilder sb2 = new StringBuilder("pongpong");
		System.out.println(sb==sb2);
		sb.append("hahaha");
		System.out.println(sb);
		String result =  sb.toString(); //스트링빌더를 스트링으로 변경
		System.out.println(result);
		sb.replace(0, 3, "ttt");
		System.out.println(sb);
		sb.delete(0, 3); //0,1,2 //여러개 지움
		System.out.println(sb);
		sb.deleteCharAt(0); //n번째 값을 하나지움
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
	}

}

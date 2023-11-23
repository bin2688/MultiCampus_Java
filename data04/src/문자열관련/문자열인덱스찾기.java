package 문자열관련;

public class 문자열인덱스찾기 {

	public static void main(String[] args) {
		int num = 12345;
		int find = 3;
		String s = String.valueOf(num); //스트링으로 변환
		String f = String.valueOf(find);
		System.out.println(s.indexOf(f) + 1);
		
		
		String s2 = String.valueOf(num);
		String[] s3 = s2.split(""); 
	}
}

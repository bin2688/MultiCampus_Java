package 배열기본;

import java.util.Arrays;

public class 스트링확인문제 {

	public static void main(String[] args) {
		String s1 = "참좋다";
		String s2 = "진짜좋다";
		
		System.out.println(s1.equals(s2)); //스트링비교
		
		if (s1.length() > s2.length()) { //글자 길이 length
			System.out.println("s1이 더큼");
		}else {
			System.out.println("s2가 더큼");
		}
		System.out.println("------3번문제끝------");
		
		
		String s3= "나는 진짜 java programmer가 되었어"; //글자 일부범위 추출
		System.out.println(s3.substring(6, 21)); //6~20
		String s33 = s3.substring(6, 21);
		System.out.println(s33.toUpperCase());
		System.out.println("------4번문제끝------");
		
		
		String s4 = "2056521";
		char c = s4.charAt(0); //글자하나추출
		if (c == '2' || c == '4') {
			System.out.println("여자임");
		}else {
			System.out.println("남자임");
		}
		System.out.println("------5번문제끝------");
		
		String s5 = "[10,220,30,405,50]";
		s5 = s5.replace("[", " "); //글자 수정
		s5 = s5.replace("]", " "); //글자 수정
		System.out.println(s5);
		s5 = s5.trim(); //공백제거
		System.out.println(s5);
		String[] s6 = s5.split(","); //, 기준으로 배열로 만들기
		Print.arrayPrint(s6);
		int sum = 0;
		for (String s : s6) {
			sum += Integer.parseInt(s);
			//sum = sum + 
		}
		System.out.println(sum);
		System.out.println("------6번문제끝------");
		
		
		int[] newArr = new int[s6.length]; //스트링배열을 새로운 int배열로 생성
		for (int i = 0; i < newArr.length; i++) {
			newArr[i] = Integer.parseInt(s6[i]);
		}
		Print.arrayPrint(newArr);
		Arrays.sort(newArr); // 오름차순정렬, 파괴형
		Print.arrayPrint(newArr);
	}

}

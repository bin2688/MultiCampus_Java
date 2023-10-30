package 메서드기본;

public class 계산유틸리티 {

	public static void main(String[] args) {
		double num = 567.1234;
		double num2 = -567.1234;
		
		System.out.println(Math.abs(num2)); //절대값 (마이너스제외)
		System.out.println(Math.ceil(num)); //소수점 무조건 올림
		System.out.println(Math.floor(num)); //소수점 무조건 내림
		System.out.println(Math.round(num)); //0.5기준으로 반올림
		System.out.println(Math.sqrt(num)); //값에 루트씌움
		System.out.println(Math.pow(num, 2));
		System.out.println(Math.max(num, num2));
		System.out.println(Math.min(num, num2));
	}
	//유틸리티(utility, util) - import java.util.*;
	//		Date, Random
	//핵심유틸리티, 너무 자주 쓰는 것들 - import java.lang.*;
	//		System, String, Math 
	// 눈에는 보이지 않지만 이미 import되어있음.

}

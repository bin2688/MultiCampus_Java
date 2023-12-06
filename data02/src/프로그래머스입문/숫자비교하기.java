package 프로그래머스입문;

import java.util.Scanner;

public class 숫자비교하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		Solution2 s = new Solution2();
		int result = s.solution(num1, num2);
		System.out.println(result);
		sc.close();
		
	}

}

class Solution2 {
    public int solution(int num1, int num2) {
        int answer = 0;
        if(num1 == num2) {
        	answer = 1;
        }else {
        	answer = -1;
        }
        return answer;
    }
}
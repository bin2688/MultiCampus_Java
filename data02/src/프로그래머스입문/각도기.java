package 프로그래머스입문;


public class 각도기 {

	public static void main(String[] args) {
		Solution4 s = new Solution4();
		int result = s.solution(70); // 70
		System.out.println(result);
		
	}

}

class Solution4 {
    public int solution(int angle) {
        int answer = 0;
        if (angle > 0 && angle < 90 ) { //0<angle<90
			answer = 1;
		}else if (angle == 90) {
			answer = 2;
		}else if (angle > 90 && angle < 180) {
			answer = 3;
		}else if (angle == 180) {
			answer = 4;
		} 
        return answer;
    }
}
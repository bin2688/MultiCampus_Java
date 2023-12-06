package 배열메서드입출력;



public class 중복숫자개수 {

	public static void main(String[] args) {
		Solution7 s = new Solution7();
		//int[] array =  {149, 180, 192, 170};
		int[] array =  {1, 1, 2, 3, 4, 5};
		int n = 1;
		int result = s.solution(array, n);
		System.out.println(result);
	}
}

class Solution7 {
	public int solution(int[] array, int n) {
        int answer = 0;
        for (int x : array) {
			if (x == n) {
				answer++;
			}
		}
        
        return answer;
	}
}

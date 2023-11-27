package 비선형구조;

public class 이차원배열 {

	public static void main(String[] args) {
		int[][] num = new int[3][]; //2차원배열 앞에[] = 행, 뒤에 [] 열(열정해지지않으면 공백)
		//{0,0,0} - 1차원배열							
		//예시) 3x3형식으로 배열을 여러개로 정렬(교실 책상배치등)						
		//{ {0,0,0}, {0,0,0}, {0,0,0} } ==> 2차원배열(배열 안에 배열)
		
		int[] row1 = {2,5,3}; // 3열
		int[] row2 = {1,2}; // 2열
		int[] row3 = {5,4,3,2,1}; //5열
		num[0] = row1;
		num[1] = row2;
		num[2] = row3;
		//num[행] = row(열)
		for (int i = 0; i < num.length; i++) { //3줄
			//2차원 배열의 각 행의 열개수를 따로 세주어야한다.
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j]);
			}
			System.out.println();
		}
		System.out.println(num[0][num[0].length - 1]);
		System.out.println(num[1][num[1].length - 1]);
		System.out.println(num[2][2]);
		

		
		
		
	}

}
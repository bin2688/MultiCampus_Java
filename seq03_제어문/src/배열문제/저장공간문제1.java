package 배열문제;

public class 저장공간문제1 {

	public static void main(String[] args) {
		int [] r = new int[200];
		
		r[0] = 1000;
		r[1] = 2000;
		r[r.length - 1] = 5000;
		
		for (int x : r) {
			System.out.print(x);
		}

	}

}

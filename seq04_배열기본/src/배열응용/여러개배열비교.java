package 배열응용;

public class 여러개배열비교 {

	public static void main(String[] args) {
		int[] term1 = { 77, 88, 99, 55, 70 };
		int[] term2 = { 99, 100, 88, 80, 70 };

		// 2학기에 오른 학생수 카운트
		// 1,2학기 동일한 학생수와 번호

		int count = 0;
		int same = 0;

		for (int i = 0; i < term2.length; i++) {
			if (term1[i] < term2[i]) {
				count++;
			} else if(term1[i] == term2[i]) {
				same++;
				System.out.println(i); //if문 안에서!!

			}
		} // for

		System.out.println(count);
		System.out.println(same);

	}

}

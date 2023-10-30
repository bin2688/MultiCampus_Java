package 배열기본;

public class 배열만들기타입별 {

	public static void main(String[] args) {
		
		int [] age = {200, 100, 50 ,10};
		for (int i = 0; i < age.length; i++) {
			System.out.println(age[i]+ " ");
		}
		System.out.println();
		for (int x : age) {
			System.out.println(x + " ");
		}
		
		
		String [] name = {"감자", "호두", "당근", "밤톨"};
			for (String n : name) {
				System.out.println(n);
			}
		
		char [] sex = {'남','여','남','여'};
			for (char c : sex) {
				System.out.println(c);
			}
		
		boolean [] food = {true, false, false, true};
			for (boolean b : food) {
				System.out.println(b);
			}
			
		}

}

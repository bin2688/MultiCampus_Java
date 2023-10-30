package 배열응용고급;

import java.util.Arrays;
import java.util.Scanner;

public class 스트링배열 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  //쉼표까지 넣어서 한번에 출력
		String w2 = sc.next();
		

		String [] w3 = w2.split(",");
		System.out.println(Arrays.toString(w3));
		int cloud = 0, sky = 0;
		for (String x : w3) {
			if (x.equals("흐림")) {
				cloud++;
			} else {
				sky++;
			}
			System.out.println(cloud + "\t" + sky);
		}



	}

}

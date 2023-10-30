package 배열응용;

import java.util.Arrays;
import java.util.Random;

public class 랜덤배열 {

	public static void main(String[] args) {
		int [] value = new int[1000];
		Random r = new Random(18);
		 
		 
		 for (int i = 0; i < value.length; i++) {
			value[i] = r.nextInt(1000);
		}//for
		 System.out.println(Arrays.toString(value));
		
		 int Count3 = 0, Count4 = 0, Count5 = 0, Count6 = 0;
		 // **count 값을 배열로 만들어서도 가능**
		 for (int i = 0; i < value.length; i++) {
			if(value[i] >= 600) {
			Count6++;
			} else if(value[i] >= 500) {
				Count5++;
			} else if(value[i] >= 400) {
				Count4++;
			} else if(value[i] >= 300) {
				Count3++;
			}//if
			
			if(value[i] == 1) {
				System.out.println("최소값이 0인 위치>>" + i);  //위치 찾을 때는  > i 
			}
		}//for
		 
		 System.out.println(
				  Count3 + " " +
				  Count4 + " " +
				  Count5 + " " +
				  Count6 + " "
				 );
		 
		 
		 Arrays.sort(value);
		 System.out.println(Arrays.toString(value));
		 
		 System.out.println(value[0]); //정렬하고나서 첫번째 값이 최소값인데, 정렬전에는 어느 위치에 있었을까? (for안에 if문에다가 사용)
		 
		 

	} //main

}

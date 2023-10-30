package 배열응용;

import java.util.Arrays;

public class 여러개배열사용 {

	public static void main(String[] args) {
		String [] 식구 = {"아버지","어머니","형","나", "동생"};
		int [] 나이 = {100,99,88,77,55};
		double [] 키 = {199.9,189.9,179.9,169.9,159.9};
		
		키[4] = 키[4] + 5; //위치알때
		
		//우리가족 내년 나이 +1
		for (int i = 0; i < 키.length; i++) {
			나이[i]++;
		}
		System.out.println(Arrays.toString(나이));
		//System.out.println(식구[0]+ " " + 나이[0] + " " + 키[0]);
		//System.out.println(식구[4]+ " " + 나이[4] + " " + 키[4]);
		System.out.println("===========");
		System.out.println("===우리가족===");
		System.out.println("===========");
		
		for (int i = 0; i < 키.length; i++) {
			System.out.println(식구[i]+ "\t" + 나이[i] + "\t " + 키[i]); //tap 크기만큼 띄어쓸때 "\t"  
		}
		
		
		//우리가족 내년 나이 +1
		
		//동생만 키가 5가 큼

		
		
		
		
		
		
		
	} //main

}

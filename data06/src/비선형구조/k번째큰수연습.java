package 비선형구조;

import java.util.Arrays;
import java.util.TreeSet;


class k번째큰수연습 {
	
	public static void main(String[] args) {
		int[] num = { 22, 33, 66, 11, 10, 15};
		int k = 2;
		Arrays.sort(num);
		int result = num[num.length - k];
		System.out.println(result);
		
		
		
		int[] num2 = {22, 22, 44, 11, 11, 33, 55, 66, 20, 10, 30, 55};
		int k2 = 3;
		TreeSet<Integer> ts = new TreeSet<>(); //오름차순정렬 + 중복제거 다해줌
		for (int i = 0; i < num2.length; i++) {
			ts.add(num2[i]);
		}
		System.out.println(ts);
		System.out.println(ts.size()); //크기
		System.out.println(ts.first()); //작은수
		System.out.println(ts.last()); //큰수
		System.out.println(ts.lower(20)); //20값보다 하나 작은 수 
		System.out.println(ts.higher(33)); //33값보다 하나 큰 수
		Object[] arr = ts.toArray();
		System.out.println(arr[arr.length - k2]); //몇번째 큰수
		
		
		
		
		
		
		
		
		
		
	}
}

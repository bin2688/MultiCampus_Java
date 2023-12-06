package 비선형구조;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Set반복자 {

	public static void main(String[] args) {
		// set은 꺼내는 기능이 없다. 순서도 없다.(순서로 보려면 list)
		HashSet<String> set = new HashSet<>();
		set.add("휴대폰");
		set.add("휴지");
		set.add("휴지");
		System.out.println(set);
		
		//반복자(iterator,이터레이터)
		Iterator<String> it =  set.iterator(); //set에 있는 값을 하나씩 꺼낼때씀
		while(it.hasNext()) {
			System.out.println(it.next());		
		}
		//array --> list : Arrays.asList()
		//
		//
		
		 Object[] arr = set.toArray();
		 System.out.println(Arrays.toString(arr));
	}

}

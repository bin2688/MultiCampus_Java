package 배열문제;



public class 배열응용문제 {

	public static void main(String[] args) {

		String [] last = {"제주도", "양양", "속초"};
		String [] year = {"제주도", "부산", "울산"};

		
		int same = 0;
		int diff = 0; 
		for (int i = 0; i < year.length; i++) {
			 if(last[i].equals(year[i])) {
				 same++;
				 System.out.println(last[i]);  //위치말고 그 값을 보고 싶을 땐 스트링명[i]까지
			 } else {
				 diff++;
			 }
		}
		System.out.println(same + " " + diff);

	}

}

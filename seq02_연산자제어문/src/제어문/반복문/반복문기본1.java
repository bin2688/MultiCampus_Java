package 제어문.반복문;

public class 반복문기본1 {

	public static void main(String[] args) {
	
		//반복문을 할 때는
				//cpu가 처음값을 변수에 저장해두고
				//1씩 증가시키면서 조건을 체크해서 반복 
				//처음값, 증가값, 조건식이 필요!
				for (int i = 0; i < 10; i++) {
				//   처음값       조건식   증감값 
					//0~9
					//반복할 때마다 처리하는 내용 
					System.out.println("@");
				}

				int start = 0; //시작값 
				while (start < 10) { //조건식
					System.out.println("%");
					start++; //증감값 
				}
}
}

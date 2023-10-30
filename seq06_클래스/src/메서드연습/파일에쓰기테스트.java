package 메서드연습;

import java.io.FileWriter;

public class 파일에쓰기테스트 {

	public static void main(String[] args) {
		try {
			FileWriter file = new FileWriter("text2.txt"); 
			file.write("hi" + "\n");
			file.write("hello" + "\n");
			file.write("goodbye");
			file.close(); //stream을 닫는다.
		} catch (Exception e) {
			//대처할 내용
			System.out.println("에러발생함."); 
			e.printStackTrace(); //자세한 에러정보
		}
		
		//FileWriter => 파일에 텍스트를 저장할 수 있는 부품
		//파일을 생성하고, 텍스트를 파일까지 보낼 수 있는 통로까지 만든다.
		//이 통로 == 강물(stream, 스트림)
		//스트림을 만드는 것을 프로그래밍할 때는 굉장히 위험한 상황!!
		//프로그램이 모두 먹통이되는 위험한 상황 발생우려
		//위험한 상황에 대해 대처를 꼭 해야함. => 파일에 읽고 쓸때 / 네트워크를 연결할 때 / cpu를 연결할 때
	}

}

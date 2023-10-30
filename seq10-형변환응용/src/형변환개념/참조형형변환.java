package 형변환개념;

import java.util.ArrayList;

public class 참조형형변환 {

	public static void main(String[] args) {
		//참조형 형변환은 상속관계에서만 가능하다.
		//가변길이, 타입 여러개일 때 사용
		//list = {a, b, c};
		//list = {b, c}; //데이터변경이 있을 때 뒤에 자리를 전부 땡긴다.
		//list = {b, d, c}; //자리를 또 옮김
		//데이터변경이 너무 많을 때 불편
		//==> LinkedList를 권장
		ArrayList list = new ArrayList();
		list.add("나는 스트링"); //
	}

}

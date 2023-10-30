package 제어문.조건문;

public class 스위치테스트1 {

	public static void main(String[] args) {
		String name = "자바";
		
		if(name.equals("자바") ) {
			System.out.println("1101호로 go!");
		} else if(name.equals("파이썬") ) {
			System.out.println("1102호로 go!");
		} else if(name.equals("리눅스") ) {
			System.out.println("1103호로 go!");
		} else
			System.out.println("카운터로 go!");
			
		switch (name) {
		case "자바":
			System.out.println("1101호로 go!");
			break;
		case "파이썬":
			System.out.println("1102호로 go!");
			break;
		case "리눅스":
			System.out.println("1103호로 go!");
			break;
		default:
			System.out.println("카운터로 go!");
			break;
			//break를 포함하고 있는{}를 찾으세요 > 거기를 벗어나겠다. if문은 break 대신 {} 계속 써줌
			//switch는 정수(long은 불가)만가능, 실수x
			//char, String 가능, 연산기호 불가능
		}

	}

}

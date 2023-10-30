package 복습;

public class 기본형복습 {

	public static void main(String[] args) {
		int count = 5;
		int price = 5000;
		
		int total = count * price;
		
		String result ="";
		if(total > 20000) {
			result = "할인해드릴게요.";
		} else {
			result = "총 커피값을 내세요.";
		}
		
		System.out.println(result);		
		
	}

}

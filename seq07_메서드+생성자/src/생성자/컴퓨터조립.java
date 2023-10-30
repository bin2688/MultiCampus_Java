package 생성자;

public class 컴퓨터조립 {

	public static void main(String[] args) {
		컴퓨터 com = new 컴퓨터(20000, "Samsung", 27.2);
		System.out.println(com);
		
		컴퓨터 com2 = new 컴퓨터(10000, "Apple", 32.2);
		System.out.println(com2);
		
	}

}

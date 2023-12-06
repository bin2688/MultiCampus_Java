package 컬렉션;

public class 제너릭프로그램 {

	public static void main(String[] args) {
		Truck<Integer, String> t1 = new Truck<>();
		t1.weight = 100;
		t1.distance ="멀~~~다";
		
		Truck<Double, Double> t2 = new Truck<>();
		
		t2.weight = 100.11;
		t2.distance = 135.3;
		
		System.out.println(t1);
		System.out.println(t2);
		
	}

}

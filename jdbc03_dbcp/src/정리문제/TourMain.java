package 정리문제;

public class TourMain {

	public static void main(String[] args) {
		Tour tour = new Tour();
		// 1
		String[] result = tour.가고싶은여행지목록();
		System.out.println("내가 가고싶은 여행지는" + result[0] + "와" + result[1] + "," + result[2] + "이다. 빨리가자!!");
		
		// 2
		String result2 = tour.제일가고싶은여행지();
		System.out.println("제일 가고 싶은 여행지는" + result2 + "인데 가기 쉽지 않다.");
		// 3
		int result3 = tour.여행지경비(2, 50000);
		if (result3 >= 200000) {
			System.out.println("이제 여행을 떠나도 된다.");
		}else {
			System.out.println(" 더 모아야한다.");
		}
	}

}